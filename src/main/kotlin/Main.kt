/*Аттестационная задача: разработать модель дорожного движения (самое главное, самое сложное - ООП декомпозиция,
поэтому задача фокусная):
1.  Разработать набор интерфейсов, абстрактных и конкретных классов, generic-ков для моделирования дорожного движения с
участием автомобилей всех типов, поездов, трамваев, троллейбусов, а также мопедов, скутеров и прочего двухколесного
транспорта. При моделировании учитывать:
•  «резину»
•  качество асфальта
•  особенности рельефа
•  сезон года
•  манеру вождения в регионе (исключительно в шутку: Северная, Нормальная, Столичная и Южная)
•  *климатические особенности, потенциальные катаклизмы (гололед, снегопад, сильный ветер)
•  *освещение
2.  Создать несколько вариантов генератора дорожной ситуации (порождающий Design Pattern, например, несколько статических
фабричных методов по генерации контейнера, содержащего разные наборы сконфигурированных объектов, реализовавшие интерфейс
IVehicle).
3.  Постараться вообще везде где только можно пользоваться интерфейсами и порождающими паттернами.
4.  Транспортные средства должны начинать и прекращать движение.
5.  Транспортные средства должны предоставлять несколько вариантов подсчета статистики:
•  Сколько машин проехало за указанный период времени
•  Сколько километров в сумме проехали все машины за указанный период времени
•  Сколько километров на дороге в среднем проводит машина
•  Сколько машин останавливается у автозаправки
•  Сколько машин заправляется, сколько ест хот дог, сколько делает и то и другое
•  Все что угодно, нафантазировать можно многое
6.  Все действия как бизнес, так и низкоуровневые (вызов конструктора, вызов геттера и сеттера), должны логироваться
в консоль (println).
7.  Пользователь может ввести номер варианта дорожно-транспортной ситуации и получить соответствующее логирование на
экран и результаты моделирования.
8.  Покрыть код Unit Test-ами.
9.  ** Создать несколько потоков по генерации дорожно-транспортной ситуации по входящем параметру (номер ситуации).
Получить статистику от каждого из потоков. Т.е. получить от пользователя количество потоков и номер ситуации для каждого
из потоков. Создать потоки, передать на вход int или string, использовать Sleep для наглядности, получить от потока на
выходе файл (например с как-то предопределённым именем). Рассчитать свою среднюю статистику по всем полученным данным.
Т.е. прочитать все сгенерированные файлы и записать свой файл со средним арифметическим данных, а также выведи его на консоль.
Рекомендации:
Задачу решать строго итерационно, шаг за шагом, всегда начинать с самого простого случая, самой простой реализации.
Задача считается засчитанной если вы пусть минималистично, но реализовали 60%+ из приведенных задач.
Задачи со звездочками начинать выполнять только после завершения всех остальных задач. Спасибо.*/

fun main(args: Array<String>) {

    println("1. Машина")
    val transportCar_Movement:Movement = car()
    val transportCar_Rubber:Rubber = car()
    val transportCar_Asphalt:Asphalt = car()
    val transportCar_Relief:Relief = car()
    val transportCar_Season:Season = car()
    val transportCar_Driving:Driving = car()

    print("Выберете колёса: ")
    val wheels = readln()!!.toString()

    println(transportCar_Movement.start_of_movement)

    print("Вы выбрали колёса: ")
    if (wheels == "Летние") {
        println(transportCar_Rubber.driving_Rubber_summer)
    } else if (wheels == "Зимние") {
        println(transportCar_Rubber.driving_Rubber_winter)
    } else {
        println(transportCar_Rubber.driving_Rubber_allSeason)
    }

    println(transportCar_Movement.stop_of_movement)

}

interface Movement {
    val start_of_movement: String
    val stop_of_movement: String
}

interface Rubber {
    val driving_Rubber_summer: String
    val driving_Rubber_winter: String
    val driving_Rubber_allSeason: String
}

interface Asphalt {
    val excellent_asphalt: String
    val good_asphalt: String
    val bad_asphalt: String
}

interface Relief {
    val horizontal_relief: String
    val inclined_relief: String
    val convex_relief: String
}

interface Season {
    val winter_season: String
    val spring_season: String
    val summer_season: String
    val autumn_season: String
}

interface Driving {
    val northern_driving: String
    val normal_driving: String
    val metropolitan_driving: String
    val southern_driving: String
}

class car: Rubber, Asphalt, Relief, Season, Movement, Driving    {
    override val driving_Rubber_summer = "Летние"
    override val driving_Rubber_winter = "Зимние"
    override val driving_Rubber_allSeason = "Всесезонные"

    override val excellent_asphalt = "Отличный асфальт"
    override val good_asphalt = "Хороший асфальт"
    override val bad_asphalt = "Плохой асфальт"

    override val horizontal_relief = "Горизонтальный рельеф"
    override val inclined_relief = "Наклонный рельеф"
    override val convex_relief = "Выпуклый рельеф"

    override val winter_season = "Зимний сезон"
    override val spring_season = "Весенний сезон"
    override val summer_season = "Летний сезон"
    override val autumn_season = "Осенний сезон"

    override val start_of_movement = "Начало движения"
    override val stop_of_movement = "Конец движения"

    override val northern_driving = "Северное вождение"
    override val normal_driving = "Нормальное вождение"
    override val metropolitan_driving = "Столичное вождение"
    override val southern_driving = "Северное вождение"
}

/*class bus: Rubber, Asphalt, Relief, Season, Movement, Driving    {
    override val driving_Rubber_summer = "Летняя"
    override val driving_Rubber_winter = "Зимняя"
    override val driving_Rubber_allSeason = "Всесезонная"

    override val excellent_asphalt = "Отличный асфальт"
    override val good_asphalt = "Хороший асфальт"
    override val bad_asphalt = "Плохой асфальт"

    override val horizontal_relief = "Горизонтальный рельеф"
    override val inclined_relief = "Наклонный рельеф"
    override val convex_relief = "Выпуклый рельеф"

    override val winter_season = "Зимний сезон"
    override val spring_season = "Весенний сезон"
    override val summer_season = "Летний сезон"
    override val autumn_season = "Осенний сезон"

    override val start_of_movement = "Начало движения"
    override val stop_of_movement = "Конец движения"

    override val northern_driving = "Северное вождение"
    override val normal_driving = "Нормальное вождение"
    override val metropolitan_driving = "Столичное вождение"
    override val southern_driving = "Северное вождение"
}

class truck: Rubber, Asphalt, Relief, Season, Movement, Driving  {
    override val driving_Rubber_summer = "Летняя"
    override val driving_Rubber_winter = "Зимняя"
    override val driving_Rubber_allSeason = "Всесезонная"

    override val excellent_asphalt = "Отличный асфальт"
    override val good_asphalt = "Хороший асфальт"
    override val bad_asphalt = "Плохой асфальт"

    override val horizontal_relief = "Горизонтальный рельеф"
    override val inclined_relief = "Наклонный рельеф"
    override val convex_relief = "Выпуклый рельеф"

    override val winter_season = "Зимний сезон"
    override val spring_season = "Весенний сезон"
    override val summer_season = "Летний сезон"
    override val autumn_season = "Осенний сезон"

    override val start_of_movement = "Начало движения"
    override val stop_of_movement = "Конец движения"

    override val northern_driving = "Северное вождение"
    override val normal_driving = "Нормальное вождение"
    override val metropolitan_driving = "Столичное вождение"
    override val southern_driving = "Северное вождение"
}

class tram: Rubber, Asphalt, Relief, Season, Movement, Driving  {
    override val driving_Rubber_summer = "Летняя"
    override val driving_Rubber_winter = "Зимняя"
    override val driving_Rubber_allSeason = "Всесезонная"

    override val excellent_asphalt = "Отличный асфальт"
    override val good_asphalt = "Хороший асфальт"
    override val bad_asphalt = "Плохой асфальт"

    override val horizontal_relief = "Горизонтальный рельеф"
    override val inclined_relief = "Наклонный рельеф"
    override val convex_relief = "Выпуклый рельеф"

    override val winter_season = "Зимний сезон"
    override val spring_season = "Весенний сезон"
    override val summer_season = "Летний сезон"
    override val autumn_season = "Осенний сезон"

    override val start_of_movement = "Начало движения"
    override val stop_of_movement = "Конец движения"

    override val northern_driving = "Северное вождение"
    override val normal_driving = "Нормальное вождение"
    override val metropolitan_driving = "Столичное вождение"
    override val southern_driving = "Северное вождение"
}

class train: Rubber, Asphalt, Relief, Season, Movement, Driving  {
    override val driving_Rubber_summer = "Летняя"
    override val driving_Rubber_winter = "Зимняя"
    override val driving_Rubber_allSeason = "Всесезонная"

    override val excellent_asphalt = "Отличный асфальт"
    override val good_asphalt = "Хороший асфальт"
    override val bad_asphalt = "Плохой асфальт"

    override val horizontal_relief = "Горизонтальный рельеф"
    override val inclined_relief = "Наклонный рельеф"
    override val convex_relief = "Выпуклый рельеф"

    override val winter_season = "Зимний сезон"
    override val spring_season = "Весенний сезон"
    override val summer_season = "Летний сезон"
    override val autumn_season = "Осенний сезон"

    override val start_of_movement = "Начало движения"
    override val stop_of_movement = "Конец движения"

    override val northern_driving = "Северное вождение"
    override val normal_driving = "Нормальное вождение"
    override val metropolitan_driving = "Столичное вождение"
    override val southern_driving = "Северное вождение"
}

class trolleybus: Rubber, Asphalt, Relief, Season, Movement, Driving  {
    override val driving_Rubber_summer = "Летняя"
    override val driving_Rubber_winter = "Зимняя"
    override val driving_Rubber_allSeason = "Всесезонная"

    override val excellent_asphalt = "Отличный асфальт"
    override val good_asphalt = "Хороший асфальт"
    override val bad_asphalt = "Плохой асфальт"

    override val horizontal_relief = "Горизонтальный рельеф"
    override val inclined_relief = "Наклонный рельеф"
    override val convex_relief = "Выпуклый рельеф"

    override val winter_season = "Зимний сезон"
    override val spring_season = "Весенний сезон"
    override val summer_season = "Летний сезон"
    override val autumn_season = "Осенний сезон"

    override val start_of_movement = "Начало движения"
    override val stop_of_movement = "Конец движения"

    override val northern_driving = "Северное вождение"
    override val normal_driving = "Нормальное вождение"
    override val metropolitan_driving = "Столичное вождение"
    override val southern_driving = "Северное вождение"
}

class bicycle: Rubber, Asphalt, Relief, Season, Movement, Driving  {
    override val driving_Rubber_summer = "Летняя"
    override val driving_Rubber_winter = "Зимняя"
    override val driving_Rubber_allSeason = "Всесезонная"

    override val excellent_asphalt = "Отличный асфальт"
    override val good_asphalt = "Хороший асфальт"
    override val bad_asphalt = "Плохой асфальт"

    override val horizontal_relief = "Горизонтальный рельеф"
    override val inclined_relief = "Наклонный рельеф"
    override val convex_relief = "Выпуклый рельеф"

    override val winter_season = "Зимний сезон"
    override val spring_season = "Весенний сезон"
    override val summer_season = "Летний сезон"
    override val autumn_season = "Осенний сезон"

    override val start_of_movement = "Начало движения"
    override val stop_of_movement = "Конец движения"

    override val northern_driving = "Северное вождение"
    override val normal_driving = "Нормальное вождение"
    override val metropolitan_driving = "Столичное вождение"
    override val southern_driving = "Северное вождение"
}

class moped: Rubber, Asphalt, Relief, Season, Movement, Driving  {
    override val driving_Rubber_summer = "Летняя"
    override val driving_Rubber_winter = "Зимняя"
    override val driving_Rubber_allSeason = "Всесезонная"

    override val excellent_asphalt = "Отличный асфальт"
    override val good_asphalt = "Хороший асфальт"
    override val bad_asphalt = "Плохой асфальт"

    override val horizontal_relief = "Горизонтальный рельеф"
    override val inclined_relief = "Наклонный рельеф"
    override val convex_relief = "Выпуклый рельеф"

    override val winter_season = "Зимний сезон"
    override val spring_season = "Весенний сезон"
    override val summer_season = "Летний сезон"
    override val autumn_season = "Осенний сезон"

    override val start_of_movement = "Начало движения"
    override val stop_of_movement = "Конец движения"

    override val northern_driving = "Северное вождение"
    override val normal_driving = "Нормальное вождение"
    override val metropolitan_driving = "Столичное вождение"
    override val southern_driving = "Северное вождение"
}

class Scooter: Rubber, Asphalt, Relief, Season, Movement, Driving  {
    override val driving_Rubber_summer = "Летняя"
    override val driving_Rubber_winter = "Зимняя"
    override val driving_Rubber_allSeason = "Всесезонная"

    override val excellent_asphalt = "Отличный асфальт"
    override val good_asphalt = "Хороший асфальт"
    override val bad_asphalt = "Плохой асфальт"

    override val horizontal_relief = "Горизонтальный рельеф"
    override val inclined_relief = "Наклонный рельеф"
    override val convex_relief = "Выпуклый рельеф"

    override val winter_season = "Зимний сезон"
    override val spring_season = "Весенний сезон"
    override val summer_season = "Летний сезон"
    override val autumn_season = "Осенний сезон"

    override val start_of_movement = "Начало движения"
    override val stop_of_movement = "Конец движения"

    override val northern_driving = "Северное вождение"
    override val normal_driving = "Нормальное вождение"
    override val metropolitan_driving = "Столичное вождение"
    override val southern_driving = "Северное вождение"
}*/