Программа генерирует исключение ArithmeticException в методе method1, “пробрасывает” это исключение методу main, в методе main это исключение не обрабатывается и “пробрасывается” дальше в надежде, что исключение не наступит.