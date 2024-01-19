## Homework

Решите, пожалуйста, [задачи](https://docs.google.com/presentation/d/1yzEOnq-2OLs_GQfFr1NWapRk3EUwXiA9/edit?usp=sharing&ouid=116447005932578256378&rtpof=true&sd=true), используя таблицы решений

Скачайте, пожалуйста, [geckodriver](https://github.com/mozilla/geckodriver/releases) или [msedgedriver](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/?form=MA13LH) и запустите тесты через консоль, используя команду

_gradle -Pbrowser=firefox clean qa -Psuite1_

_gradle -Pbrowser=firefox clean qa -Psuite2_

или

_gradle -Pbrowser=edge clean qa -Psuite1_

_gradle -Pbrowser=edge clean qa -Psuite2_

дефолтная команда для запуска в Chrome всего набора тестов в проекте

_gradle clean qa_
