# Сетевое консольное приложения для управления коллекцией - Клиент
## Описание
Разделение [Консольного приложения для управления коллекцией](https://github.com/SuperJaremy/Lab5) на клиентский и серверный модули.  
Клиентский модуль в интерактивном режиме считывает команды, передаёт их для выполнения на сервер и выводит результаты выполнения.
## Интерактивный режим
- help : вывести справку по доступным командам
- info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)
- show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении
- add {element} : добавить новый элемент в коллекцию
- update id {element} : обновить значение элемента коллекции, id которого равен заданному
- remove_by_id id : удалить элемент из коллекции по его id
- clear : очистить коллекцию
- execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.
- exit : завершить программу
- remove_first : удалить первый элемент из коллекции
- add_if_max {element} : добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции
- history : вывести последние 8 команд (без их аргументов)
- sum_of_number_of_participants : вывести сумму значений поля numberOfParticipants для всех элементов коллекции
- count_by_number_of_participants numberOfParticipants : вывести количество элементов, значение поля numberOfParticipants которых равно заданному
- print_field_descending_number_of_participants : вывести значения поля numberOfParticipants всех элементов в порядке убывания

# Net Console Application for Collection Management - Client
## Description
Division of [Console Application for Collection Management](https://github.com/SuperJaremy/Lab5) on server and client sides.  
Client reads comands from user's terminal, sends them to server for execution, writes the execution results.
## Interactive Mode
- help : show all available commands
- info: write general inforamtion about collection (initialization date, element count, etc.) to stdout
- show : write collection to stdout
- add {element} : add new element to collection
- update id {element} : update collection element with set id
- remove_by_id id : remove element with set id from collection
- clear : remove all element from collection
- execute_script file_name : read and execute commands from set file.
- exit : terminate programm
- remove_first : remove first element from collection
- add_if_max {element} : add element to collection if its value is greater than every value of elements in collection
- history : write last 8 commands to stdout
- sum_of_number_of_participants : write to stdout the sum of numberOfParticipants field of all elements in collection
- count_by_number_of_participants numberOfParticipants : write to stdout the number of elements which have value of field numberOfParticipants that is equal to set value
- print_field_descending_number_of_participants : write values of numberOfParticipants file of elements of collection in descending order
