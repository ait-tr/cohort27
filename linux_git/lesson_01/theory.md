## GIT - система контроля версий

- **Git** - вспомогательная программа (инструмент) любого разработчика
- **GitHub** - интернет-площадка (хостинг проектов)
- **GitHub Pages** - сервис GitHub (хостинг статических файлов)

## Необходимые навыки (знания) для командной работы

1. **Знание базового порядка работы**
2. **Механизм ветвления**
    1. Стратегии ветвления
    2. Основные команды
3. **Модели совместной разработки**
    1. Их особенности (различия)
    2. Порядок работы

## Основные термины

- **репозиторий** - файловая БД, в которой хранятся все изменений (история) проекта
    - находится в каталоге `.git/`
- **клонирование репо** - скачивание репо на компьютер
    - `git clone url`

## Базовый порядок работы

1. **Инициализация репо (локальной)**
    1. `git init`
2. **Индексация изменений (файлов)**
    1. `**git add .**`
    2. `git add -A`
    3. добавление в очередь на коммит (сохранение)
3. **Выполнение фиксации (сохранения) - коммит**
    1. `**git commit -m 'описание изменений'**`
4. **Создание репо на GitHub**
5. **Привязка репо LOCAL ↔ REMOTE**
    1. `git remote add origin ссылка`
6. **Выгрузка ветки на GitHub**
    1. `git push -u origin main`
    2. `**git push**`

## Виды программных интерфейсов

- `GUI` (Graphical User Interface) - графический интерфейс пользователя
- `CLI` (Command Line Interface) - интерфейс командной строки

## Базовые состояния файлов в Git

1. Неотслеживаемые (по умолч.)
2. Отслеживаемые
3. Игнорируемые файлы

## Генерация пары SSH-ключей (ключевых файлов)

- `ssh-keygen -t ed25519 -C 'email@example.org'`
- ключи находятся в каталоге `~/.ssh`
- пара ключей генерируется, как правило, в начале карьеры
- ключи
    - открытый (`public`) - можно везде распространять
    - закрытый (`приватный`) - храним в секрете

## Просмотр текущей привязки

```bash
git remote -v
```

## Удаление привязки

```bash
git remote rm название
```

## Просмотр состояния раб/каталога

```bash
git status -s # сжатый вывод
```

## Легенда git status -s

- `??` - Untracked
- `M` - Modified
- `A` - Added
- `D` - Deleted
- `R` - Renamed

красный цвет - изменения непроиндексированы

зеленый цвет - изменения проиндексированы

## Ветвление в Git

- ветка - изолированный поток разработки (еще одна версия проекта)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/95d3eea4-bdd9-4866-805a-55b03d066b78/139f4b42-dc01-42f3-a948-599ded416ae5/Untitled.png)

## Стратегии ветвления в Git

1. **Git Flow**
    1. `main/master/stable/production` - long-term (только для проверенного кода - “священный грааль”)
    2. `develop/current` - long-term (для тестирования, текущая разработка)
    3. `login/payments/bugfix1/issue01` - short-term
2. **GitHub Flow**
    1. `main` - long-term
    2. short-term branches

## Базовые команды работы с ветками

- `git branch` просмотр веток
    - `git branch -avv` подробный вывод
- `git branch новая_ветка` создать новую ветку от **текущей**
    - `git branch новая_ветка main` ответвиться от `**main**`
- `git checkout main` переключиться на ветку `main`
    - `git checkout -` переключиться на предыдущую ветку
- `git branch -m новое_название` переименовать текущую ветку
- `git push -u origin название_ветки` выгрузить на GitHub
- `git checkout -b новая_ветка` создать и переключиться на новую ветку
    - `git checkout -b новая_ветка main`
- `git branch -D название_ветки`  удалить локальную ветку
- `git push origin --delete название_ветки` удалить дистанционную ветку

## Слияние веток

- **Слияние (веток)** - объединение (перенос или интеграция) измений из одной ветки в другую
- `git merge название_ветки` выполнить слияние
- **перед слиянием необходимо переключиться на целевую ветку**

## Ссылки

- [как клонировать репо](https://learn.microsoft.com/ru-ru/azure/developer/javascript/how-to/with-visual-studio-code/clone-github-repository?tabs=create-repo-command-palette%2Cinitialize-repo-activity-bar%2Ccreate-branch-command-palette%2Ccommit-changes-command-palette%2Cpush-command-palette)
- [знакомство с Git](https://git-scm.com/book/ru/v2/%D0%92%D0%B2%D0%B5%D0%B4%D0%B5%D0%BD%D0%B8%D0%B5-%D0%A7%D1%82%D0%BE-%D1%82%D0%B0%D0%BA%D0%BE%D0%B5-Git%3F)
- [введение в ветвление](https://git-scm.com/book/ru/v2/%D0%92%D0%B5%D1%82%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B2-Git-%D0%9E%D1%81%D0%BD%D0%BE%D0%B2%D1%8B-%D0%B2%D0%B5%D1%82%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D1%8F-%D0%B8-%D1%81%D0%BB%D0%B8%D1%8F%D0%BD%D0%B8%D1%8F)
- [как сгенерировать SSH-пару ключей](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent)