# Зачем нужна система контроля версий?

Каждому из нас хотя бы раз в жизни при написании программы или редактировании текста было необходимо откатиться назад, например, потому, что вы случайно удалили важный параграф.

Хорошо, если это изменение, которое произошло только что — многие редакторы поддерживают отмену изменений, например, сочетанием клавиш `Ctrl`+`Z`.

Однако трудно обратить действия, если изменения произошли давно, а ошибка была обнаружена спустя какое-то время. В таком случае самое простое решение — раз в день создавать копию документа и помещать в другую папку, помечая ее датой, в которую эти изменения были созданы.

Это самое простое в реализации решение, однако при восстановлении легко ошибиться и перепутать папки. Ситуация еще больше усложняется, если над этим документом или кодом программы работают несколько человек, каждый из которых решает свои собственные задачи.

Система контроля версий предназначена для сохранения истории изменений.

История представляет собой снимки проекта, следующие друг за другом в хронологическом порядке. В любой момент можно откатиться к любому состоянию системы в прошлом.

Таким образом, можно восстановить поврежденные или случайно удаленные файлы, а также выяснить, кто автор внесенных в код изменений.

Другое назначение системы контроля версий — организация командной работы над проектом.

Система контроля версий в команде разработчиков позволяет корректно слить изменения от нескольких участников, не перезаписывая результаты работы друг друга.

При возникновении конфликтной ситуации, когда разработчики правят один и тот же участок кода, система обязательно просигнализирует об этом. Добавить новый код без устранения конфликта не получится.

# Настройка `git`

Перед началом работы необходимо сообщить `​git`, ​кто вы и как вас представлять другим участникам распределенной системы контроля версий. Пока вы не подпишетесь, система не даст вам регистрировать снимки проекта, коммиты.

Все ваши изменения должны быть подписаны вашим именем и электронным адресом, чтобы другие участники проекта знали, чьи это правки и как с вами связаться. Сделать это нужно один раз, как правило, сразу после установки git, если вы переустановите систему, процедуру потребуется повторить.

Чтобы задать ваши имя и электронный адрес, следует воспользоваться командой `​git config`:​
```bash
git config --global user.name "John Doe"
git config --global user.email johndoe@example.com
```

Убедиться в том, что настройки успешно установлены, можно, запросив их список при помощи команды ​`git config --list`.​

Она выдает множество настроек, в том числе и только что установленные значения.
```
user.name=John Doe
user.email=johndoe@example.com
```

# Файл `.gitignore`

Файл `.gitignore` для работы с проектом в `IntelliJ Idea` должен включать в себя следующие строчки:
```
.idea/
*.iml
```

# Работа с GitHub и IntelliJ Idea

Работа с [GitHub](https://github.com) в нужном нам количестве подробно описана на видеозаписи занятия.

[Документация по настройке IntelliJ Idea](https://www.jetbrains.com/help/idea/github.html)

# Сценарии использования `Git` и [GitHub](https://github.com)

## Создали проект с репозиторием в Idea, создали пустой репозиторий на GitHub

Идеальный вариант.

1. Создаёте проект в Idea с Git репозиторием и примером кода (sample code):
   ![Создаёте проект в Idea с Git репозиторием и примером кода (sample code)](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/project.png)
2. Добавляете в файл `.gitignore` следующие строчки:
   ```
   .idea/
   *.iml
   ```
   1. Если папка `.idea` и файл `ИмяПроекта.iml` отмечены зелёным, то нажимаете кнопку **Rollback** и отмечаете именно их. После отката изменений файлы будут отмечены серо-жёлтым.
   ![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/rollback.png)
   1. Если папка `.idea` и файл `ИмяПроекта.iml` (были) отмечены красным, то через какое-то время они сразу станут отмечены жёлтым, кнопка **Rollback** при этом будет недоступна.
3. Пишете свой код, коммитите изменения.
4. Создаёте на GitHub пустой репозиторий
   ![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/empty_github_repo.png)
5. Для сохранения изменений на GitHub подключаете свой созданный проект через меню **"Git" -> "Manage remotes..." -> "+"** или через **"Push" -> "Define remote"**.
   - **"Git" -> "Manage remotes..." -> "+"**
      1. ![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/Git-Manage_remotes.png)
      2. ![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/add_remote.png)
   - **"Push" -> "Define remote"**
      1. ![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/Push-Define_remote.png)
   В качестве ссылки вставляете скопированную с GitHub HTTPS-ссылку.
   1. ![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/empty_github_repo_link.png)
   2. ![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/define_remote.png)
6. После этого при первой на этом компьтере попытке команды **Push** Idea попросит зайти на GitHub (**Log in via GitHub...**).
   1. ![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/idea-github.png)
   2. ![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/jetbrains.png)
   3. ![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/github-jetbrains.png)
   4. Открывшуюся страницу с текстом "You can close this page" можно закрывать.

## Создали проект с репозиторием в Idea, создали репозиторий **с файлами** на GitHub

Делаете всё, как в предыдущем пункте.

Ссылка расположена вот здесь:
![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/github_repo_link.png)

При попытке **Push** необходимо сделать **Force push**.
![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/force_push.png)

При необходимости нажать пункт **Force push anyway**.
![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/force_push_anyway.png)

## Создали репозиторий с файлами на GitHub, загружаете его в качестве проекта в Idea.

1. Создаёте репозиторий на GitHub
   ![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/github_repo.png)
2. Создаёте проект в Idea из существующего (**Get from VCS** - получить из системы контроля версий)
   ![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/get_from_vcs.png)
3. Добавляете в файл `.gitignore` следующие строчки:
   ```
   .idea/
   *.iml
   ```
4. Создаёте папку **src**.
5. Помечаете её как **Sources Root**:
   **Mark Directory as -> Sources Root**
   ![](https://github.com/ait-tr/cohort24/raw/main/basic_programming/lesson_34/img/mark_as-Sources_root.png)
6. Пишете свой код, коммитите (**Commit**) и пушите (**Push**) изменения.
