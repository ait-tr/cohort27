package de.aittr.g_27_jwt.security.sec_controller;

import de.aittr.g_27_jwt.domain.entity.User;
import de.aittr.g_27_jwt.security.sec_dto.RefreshRequestDto;
import de.aittr.g_27_jwt.security.sec_dto.TokenResponseDto;
import de.aittr.g_27_jwt.security.sec_service.AuthService;
import jakarta.security.auth.message.AuthException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private AuthService service;

    public AuthController(AuthService service) {
        this.service = service;
    }

    // Метод доработан.
    // Теперь в случае успешного логина токен доступа отправляется не только
    // в теле ответа, но ещё и записывается в куки.
    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody User user, HttpServletResponse response) {
        try {
            TokenResponseDto tokenDto = service.login(user);
            Cookie cookie = new Cookie("Access-Token", tokenDto.getAccessToken());
            cookie.setPath("/");
            cookie.setHttpOnly(true);
            response.addCookie(cookie);
            return ResponseEntity.ok(tokenDto);
        } catch (AuthException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/access")
    public ResponseEntity<TokenResponseDto> getNewAccessToken(@RequestBody RefreshRequestDto request) {
        TokenResponseDto accessToken = service.getAccessToken(request.getRefreshToken());
        return ResponseEntity.ok(accessToken);
    }

    // При логауте куке с токеном доступа выставляется время жизни, равное 0,
    // благодаря чему данная кука сразу же перестаёт действовать.
    @GetMapping("/logout")
    public void logout(HttpServletResponse response) {
        Cookie cookie = new Cookie("Access-Token", null);
        cookie.setPath("/");
        cookie.setHttpOnly(true);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }
}