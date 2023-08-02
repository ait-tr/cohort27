# Why is Version Control System Needed? (Зачем нужна система контроля версий?)

Each one of us, at least once in our lives while writing a program or editing text, has needed to roll back, for example, because we accidentally deleted an important paragraph.

Каждому из нас хотя бы раз в жизни при написании программы или редактировании текста было необходимо откатиться назад, например, потому, что вы случайно удалили важный параграф.

It's fine if the change happened just now - many editors support undoing changes, for example, with the `Ctrl`+`Z` key combination.

Хорошо, если это изменение, которое произошло только что — многие редакторы поддерживают отмену изменений, например, сочетанием клавиш `Ctrl`+`Z`.

However, it becomes difficult to undo actions if the changes happened a long time ago and the error was discovered later. In such cases, the simplest solution would be to create a copy of the document once a day and place it in another folder, labeling it with the date on which these changes were made.

Однако трудно обратить действия, если изменения произошли давно, а ошибка была обнаружена спустя какое-то время. В таком случае самое простое решение — раз в день создавать копию документа и помещать в другую папку, помечая ее датой, в которую эти изменения были созданы.

This is the simplest solution in implementation, but when it comes to restoring, it is easy to make mistakes and confuse folders. The situation becomes even more complicated if multiple people work on this document or program code, each of them solving their own tasks.

Это самое простое в реализации решение, однако при восстановлении легко ошибиться и перепутать папки. Ситуация еще больше усложняется, если над этим документом или кодом программы работают несколько человек, каждый из которых решает свои собственные задачи.

A version control system is designed to keep a history of changes.

Система контроля версий предназначена для сохранения истории изменений.

The history consists of snapshots of the project, following each other in chronological order. At any time, you can roll back to any state of the system in the past.

История представляет собой снимки проекта, следующие друг за другом в хронологическом порядке. В любой момент можно откатиться к любому состоянию системы в прошлом.

Thus, you can restore damaged or accidentally deleted files, as well as find out who made the changes to the code.

Таким образом, можно восстановить поврежденные или случайно удаленные файлы, а также выяснить, кто автор внесенных в код изменений.

Another purpose of version control systems is to organize teamwork on a project.

Другое назначение системы контроля версий — организация командной работы над проектом.

In a team of developers, a version control system allows you to correctly merge changes from multiple participants without overwriting each other's work.

Система контроля версий в команде разработчиков позволяет корректно слить изменения от нескольких участников, не перезаписывая результаты работы друг друга.

In case of a conflicting situation where developers are editing the same section of code, the system will signal this. It won't be possible to add new code without resolving the conflict.

При возникновении конфликтной ситуации, когда разработчики правят один и тот же участок кода, система обязательно просигнализирует об этом. Добавить новый код без устранения конфликта не получится.

# Setting Up `git` (Настройка `git`)

Before starting work, you need to let `git` know who you are and how to identify you to other participants in the distributed version control system. Until you sign in, the system won't allow you to record project snapshots or commits.

Перед началом работы необходимо сообщить `​git`, ​кто вы и как вас представлять другим участникам распределенной системы контроля версий. Пока вы не подпишетесь, система не даст вам регистрировать снимки проекта, коммиты.

All your changes should be signed with your name and email address, so other project participants know whose edits they are and how to contact you. You only need to do this once, usually right after installing `git`, but if you reinstall the system, you'll need to repeat the procedure.

Все ваши изменения должны быть подписаны вашим именем и электронным адресом, чтобы другие участники проекта знали, чьи это правки и как с вами связаться. Сделать это нужно один раз, как правило, сразу после установки git, если вы переустановите систему, процедуру потребуется повторить.

To set your name and email address, use the `git config` command:

Чтобы задать ваши имя и электронный адрес, следует воспользоваться командой `​git config`:​
```bash
git config --global user.name "John Doe"
git config --global user.email johndoe@example.com
```

You can verify that the settings have been successfully set by requesting the list of configurations using the `git config --list` command:

Убедиться в том, что настройки успешно установлены, можно, запросив их список при помощи команды ​`git config --list`.​

Она выдает множество настроек, в том числе и только что установленные значения.
```
user.name=John Doe
user.email=johndoe@example.com
```

# `.gitignore` File (Файл `.gitignore`)

Файл `.gitignore` для работы с проектом в `IntelliJ Idea` должен включать в себя следующие строчки:

The `.gitignore` file for working with a project in `IntelliJ Idea` should include the following lines:
```
.idea/
*.iml
out/
```

# Working with GitHub and IntelliJ Idea (Работа с GitHub и IntelliJ Idea)

Working with [GitHub](https://github.com) is described in detail in the recorded session.

Работа с [GitHub](https://github.com) в нужном нам количестве подробно описана на видеозаписи занятия.

[ДDocumentation for setting up IntelliJ Idea with GitHub (окументация по настройке IntelliJ Idea)](https://www.jetbrains.com/help/idea/github.html)

# Use Cases for `Git` and [GitHub](https://github.com) (Сценарии использования `Git` и [GitHub](https://github.com))

## Created a Project with a Repository in Idea, Created an Empty Repository on GitHub (Создали проект с репозиторием в Idea, создали пустой репозиторий на GitHub)

Ideal scenario.

Идеальный вариант.

1. Create a project in Idea with a Git repository and sample code:

   Создаёте проект в Idea с Git репозиторием и примером кода (sample code):
   ![Создаёте проект в Idea с Git репозиторием и примером кода (sample code)](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/project.png)
2. Add the following lines to the `.gitignore` file:

   Добавляете в файл `.gitignore` следующие строчки:
   ```
   .idea/
   *.iml
   out/
   ```
   1. If the `.idea` folder and the `ProjectName.iml` file are marked in green, press the **Rollback** button and mark only them. After rolling back the changes, the files will be marked in gray-yellow.

      Если папка `.idea` и файл `ИмяПроекта.iml` отмечены зелёным, то нажимаете кнопку **Rollback** и отмечаете именно их. После отката изменений файлы будут отмечены серо-жёлтым.

      ![](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/rollback.png)
   1. If the `.idea` folder and the `ProjectName.iml` file were marked in red, after some time, they will be marked in yellow, and the **Rollback** button will be unavailable.

      Если папка `.idea` и файл `ИмяПроекта.iml` (были) отмечены красным, то через какое-то время они сразу станут отмечены жёлтым, кнопка **Rollback** при этом будет недоступна.
3. Write your code, commit changes.

   Пишете свой код, коммитите изменения.
4. Create an empty repository on GitHub:

   Создаёте на GitHub пустой репозиторий
   ![](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/empty_github_repo.png)
5. To save changes to GitHub, connect your created project through the menu **"Git" -> "Manage remotes..." -> "+"** or through **"Push" -> "Define remote"**.

   Для сохранения изменений на GitHub подключаете свой созданный проект через меню **"Git" -> "Manage remotes..." -> "+"** или через **"Push" -> "Define remote"**.
   - **"Git" -> "Manage remotes..." -> "+"**
      1. ![](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/Git-Manage_remotes.png)
      2. ![](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/add_remote.png)
   - **"Push" -> "Define remote"**
      1. ![](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/Push-Define_remote.png)
   Use the copied GitHub HTTPS link as the URL.

   В качестве ссылки вставляете скопированную с GitHub HTTPS-ссылку.
   1. ![](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/empty_github_repo_link.png)
   2. ![](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/define_remote.png)
6. After this, the first time you attempt to use the **Push** command on this computer, Idea will prompt you to log in to GitHub (**Log in via GitHub...**).

   После этого при первой на этом компьтере попытке команды **Push** Idea попросит зайти на GitHub (**Log in via GitHub...**).
   1. ![](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/idea-github.png)
   2. ![](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/jetbrains.png)
   3. ![](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/github-jetbrains.png)
   4. You can close the page that opens with the text "You can close this page".
      Открывшуюся страницу с текстом "You can close this page" можно закрывать.

## Created a Project with a Repository in Idea, Created a Repository **with Files** on GitHub (Создали проект с репозиторием в Idea, создали репозиторий **с файлами** на GitHub)

Do everything as in the previous item.

Делаете всё, как в предыдущем пункте.

The link is located here:

Ссылка расположена вот здесь:
![](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/github_repo_link.png)

When trying to **Push**, you need to do a **Force push**.

При попытке **Push** необходимо сделать **Force push**.
![](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/force_push.png)

If necessary, click on **Force push anyway**.

При необходимости нажать пункт **Force push anyway**.
![](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/force_push_anyway.png)

## Created a Repository with Files on GitHub, Loaded It as a Project in Idea (Создали репозиторий с файлами на GitHub, загружаете его в качестве проекта в Idea)

1. Create a repository on GitHub:

   Создаёте репозиторий на GitHub
   ![](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/github_repo.png)
2. Create a project in Idea from the existing one (**Get from VCS**).

   Создаёте проект в Idea из существующего (**Get from VCS** - получить из системы контроля версий)
   ![](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/get_from_vcs.png)
3. Add the following lines to the `.gitignore` file:

   Добавляете в файл `.gitignore` следующие строчки:
   ```
   .idea/
   *.iml
   out/
   ```
4. Create a folder named **src**.

   Создаёте папку **src**.
5. Mark it as **Sources Root**:

   Помечаете её как **Sources Root**:
   **Mark Directory as -> Sources Root**
   ![](https://github.com/ait-tr/cohort27/raw/main/basic_programming/lesson_52/img/mark_as-Sources_root.png)
6. Write your code, commit (**Commit**), and push (**Push**) changes.

   Пишете свой код, коммитите (**Commit**) и пушите (**Push**) изменения.
