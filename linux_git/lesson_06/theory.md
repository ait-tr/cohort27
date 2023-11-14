## Ссылки

- [Что такое **Docker**](https://ru.wikipedia.org/wiki/Docker)
- [базовые команды **Docker**](https://www.edureka.co/blog/docker-commands/)
- [SemVer](https://semver.org/lang/ru/)

## Базовая программная диагностика сервера

1. **Просмотр текущих подключений по SSH**
- `w`
1. **Просмотр информации о дистрибутиве (сборке)**
- `cat /etc/os-release`
1. **Просмотр уровень загрузки сервера**
- `htop`
- `q` - для выхода
1. **Просмотр загрузки ПЗУ (жесткие диски, SSD и т.д.)**
- `df -h`
    - `-h` human-readable
1. **Проверка сетевой подсистемы**
    - `ping google.de`
    - `CTRL + C` - прервать

## Масштабирование

1. Вертикальное (качественный показатель)
2. Горизонтальное (количественный показатель)

## Установка Docker

[Get Docker](https://docs.docker.com/get-docker/)

## Регистрация на Docker Hub

[Docker Hub Container Image Library | App Containerization](https://hub.docker.com/)

## Базовые компоненты любого проекта

- `FE` интерфейс
- `BE` бизнес-логика
- `DB` хранилище
- `Deployment` развертывание (напр., с помощью **Docker**)

## Что такое Docker

- прикладное ПО  (приложение) - появилось в 2013
- представляет собой платформу для контейнеризации приложений

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/013ee090-8a10-4ae2-a1c4-f40d83c57a24/Untitled.png)

!https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/e913f9f3-2737-4204-b4ef-252ec3e43b87/Untitled.png

## Решение проблем (ОС Windows)

- открыть `cmd` (командный интерфейс)
- `wsl --update`

## Основные термины

- **Образ (image)** - выполняемый пакет, который включает все необходимое для запуска приложения, включая код приложения, среду выполнения и зависимости
- **Контейнер (container)** - экземпляр образа (процесс), который выполняется в изолированной среде
    - обеспечивает уровень изоляции от других приложений и основной системы
- **`Dockerfile`** - текстовый файл, содержащий инструкции для построения **Docker-образа**
    - определяет код и зависимости (состав), которые должны быть включены в образ
- **Docker Hub** - самый распространенный реестр образов
    - позволяет делиться собственными образами и хранит базовые (стандартные) образы
- **Docker CLI** - командный интерфейс работы с Docker
- **Docker Desktop** - GUI-интерфейс работы с Docker

## Основные команды

- `docker version` просмотр версии
- `docker login` авторизация на **Docker Hub** (и проверка)
- `docker run -it ubuntu bash` запуск оболочки `bash` в режиме песочницы
- `docker build -t game-app .` создать (создать) образ на основе **Dockerfile** из текущего каталога
- `docker run game-app` запуск образа
    - `CTRL + C` прерывать выполнение
    - `docker run -p host_port:container_port image_name`
    - `docker run -p 5000:5000 game-app` с пробросом портов
- `docker tag image_name docker_hub_username/repo_name` привязка к **DockerHub**
    - `docker tag game-app andreibakhtinov/game`
- `docker push docker_hub_username/repo_name` выгрузка на **DockerHub**
    - `docker push andreibakhtinov/game`

## Базовый порядок с Docker

1. Открыть имеющийся проект (или создать новый)
2. Создать `Dockerfile`
3. Создать образ (на основе `Dockerfile`)
4. Запуск контейнера на основе образа

## Тестовый проект #1 (на Python)

```python
## файл app.py

from flask import Flask

app = Flask(__name__)

@app.route('/')
def hello():
    return 'Hello, ANDREI!'

if __name__ == '__main__':
    app.run(debug=True, host='0.0.0.0')
```

```docker
## Dockerfile

# Указываем базовый образ
FROM python:3.8-slim

# Устанавливаем зависимости
RUN pip install --no-cache-dir flask

# Копируем файлы в рабочую директорию контейнера
COPY . /app
WORKDIR /app

# Указываем команду, которая будет выполняться при запуске контейнера
CMD ["python", "app.py"]
```

## Тестовый проект #2 (на Java)

`git clone https://github.com/spring-projects/spring-petclinic.git`

```docker
## Dockerfile

FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]
```

## Семантическое версионирование (`SemVer`)

- Методология (де-факто пром/стандарт) нумерации версий проекта (версионирование)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/9ead9339-7723-4574-8a6b-5421324c1609/Untitled.png)

### v`MAJOR`.`MINOR`.`PATCH`

`PATCH` - исправление багов, прочие мелкие правки

`MINOR` - улучшения (без нарушения обратной совместимости)

`MAJOR` - координальные изменения (с нарушением обратной совместимости)