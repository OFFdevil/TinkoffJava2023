# TASK1

## Опыт, какие навыки имеете:
    Java (Grps, Spring, PostgreSQL): 
        1. Писал клиент-серверное взаимодействие для проектов в вузе
        2. Android игра: generals.io (копия с возможностью легко кастомизировать приложение для себя)
    Scala (Akka, ZIO, PostgreSQL, MySQL, Redis): 
        1. Добавлял функциональности в внутреннюю базу данных Yandex и улучшал телефонию Яндекс.Вертикалей (Yandex Internship)
        2. Реализовывал протокол для навешивания гарантий на Apache Storm (дипломная работа)

    Также писал бэк на С++ (Qt) для проектов в вузе и синтаксические анализаторы на Python (yacc, (+ ml библиотеки: pytorch, tf2, sklearn))

    Kotlin: бэк для финансовой корпорации (NDA)


## Цели, что хотите получить от курса
    1. Больше проказаться в Backend разработке на Java
    2. Написать крутой курсовой проект для резюме
    3. Получить сертификат 
    4. Пройти собеседования на работу в Тинькофф
   


## Курсовой проект
    Пока не определился

## Git

### init
    Создание нового репозитория в текущем рабочем каталоге. Git создает скрытую папку с именем .git, где будет содержаться вся информация про ваш git репозиторий. После этого момента можно вести отслеживания изменений в вашем проекте
    
    
    
`git init` -> бум, теперь могу использовать все другие команды для git
            
### clone
    Копирует удаленный репозиторий на локальную машину (всё всё скачивает в текущую рабочую папку)

`git clone <reference>` - теперь есть локальная копия удаленного репозитория, в которую можно добавлять изменения

### add
    Есть несколько хранилищ в git:
        1. Working Directory: когда изменяем файлы, они будут изменены только тут
        2. Staging Area: после использования команды add, определенные файлы перемещаются сюда 
        3. Repository: после использования команды commit все файлы, которые были изменены и, изменения которыз, были добавлены в Staging Area сохраняются в виде отдельного snapshot-а или по-другому commit-а

    Таким образом, команда add перемещает файлы из Working Directory -> Staging Area

`git add *` -> все файлы, которые были модифицированы, перенести из Working Directory -> Staging Area

`git add bibibyby.java` -> сохранить изменения, которые были сделаны в файле `bibibyby.java` 

Если файл, который хотят перенести, не был изменён, то ничего не происходит.
### commit
    Как было написано выше: сохраняет изменения, которые были перенесы в Staging Area

    Для каждого коммита НУЖНО писать краткую выжимку того, что было сделано в нём 

`git commit -m "Добавил картинку котика"` -> таким образом, можно сразу указать комментарий, который будет прикреплен к коммиту 

Если не было добавлено никаких изменений в Staging Area, то commit не будет создан

### push
    После того, как были сделаны изменения в локальном репозитории, стоит это изменения добавить в удаленный репозиторий (если конечно хотите это делать). 

    Команда push это и делает, она копирует все(либо определенные) изменения из локального репозитория в удаленный

`git push` - смотрит, каких коммитов не хватает в удаленнном репозитории, и скачивает их туда

`git push origin <from (local commit)>:<to (remote branch)>` - скачивает все изменения до `<local commit>` (включительно) в `<remote branch>`, которая находится в удаленном репозитории
### pull
    Иногда в удаленном репозитории происходят изменения, поэтому нужно обновлять локальный репозиторий, чтобы не было конфликтов. Для этого существуют 2 команды: git fetch, которая скачивает всю информацию с удаленного репозитория, и git merge

    Так как эти команды очень часто используются вместе (т.к. git fetch одновляет только ветку, которая ссылается на удаленную, но локальную, которая не ссылается на неё, тоже нужно обновлять)

    git pull -> git fetch, git merge (rebase)
    
    То эта команда: 
        1. Обновляет репозиторий
        2. Пытается объеденить изменения с удаленной ветки с изменениями в вашем локальном репозитории

