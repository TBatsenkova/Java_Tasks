Программа буферизирует битовые данные и затем записывает их в файл. Потом считывает битовые данные из файла в буфер и выводит данные на экран.
******************************************************************************************************************************
Класс BufferedOutputStream создает буфер для потоков вывода. Этот буфер накапливает выводимые байты без постоянного обращения к устройству. И когда буфер заполнен, производится запись данных.

Класс BufferedOutputStream в конструкторе принимает в качестве параметра объект OutputStream - в примере это файловый поток вывода FileOutputStream.

BufferedInputStream служит для организации более эффективного "буферизованного" ввода данных. Буферизация ввода-вывода является удобным способом оптимизации производительности, позволяя заключить в оболочку любой поток класса InputStream.

В конструкторе класса BufferedInputStream необходимо передать InputStream.
