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

    val transportCar_Movement:Movement = all_movement()

    /*val transportCar_Rubber:Rubber = car()
    val transportCar_Asphalt:Asphalt = car()
    val transportCar_Relief:Relief = car()
    val transportCar_Season:Season = car()
    val transportCar_Driving:Driving = car()*/

    val criterionRubber:Rubber = road_data()
    val criterionAsphalt:Asphalt = road_data()
    val criterionRelief:Relief = road_data()
    val criterionSeason:Season = road_data()
    val criterionDriving:Driving = road_data()

    val criterionNumberofCars:numberofCars = road_data()
    val criterionDistance:Distance = road_data()
    val criterionAverageDistance:averageDistance = road_data()
    val criterionGasStations:gasStations = road_data()

    //val array = arrayListOf(transportCar_Rubber, transportCar_Asphalt, transportCar_Relief, transportCar_Season, transportCar_Driving)

    /*val array_1 = arrayListOf("",
        "Первая дорожно-транспотная ситуация",
        "Вторая дорожно-транспотная ситуация",
        "Третья дорожно-транспотная ситуация",
        "Четвертая дорожно-транспотная ситуация",
        "Пятая дорожно-транспотная ситуация")*/
    println("Выберете дорожно-транспотную ситуацию: \n")

    println("1. Первая дорожно-транспотная ситуация")
    println("Колеса: " + criterionRubber.driving_Rubber_summer)
    println("Асфальт: " + criterionAsphalt.excellent_asphalt)
    println("Рельеф: " + criterionRelief.convex_relief)
    println("Сезон: " + criterionSeason.summer_season)
    println("Манера вождения: " + criterionDriving.southern_driving)

    println("\n2. Вторая дорожно-транспотная ситуация")
    println("Колеса: " + criterionRubber.driving_Rubber_allSeason)
    println("Асфальт: " + criterionAsphalt.bad_asphalt)
    println("Рельеф: " + criterionRelief.inclined_relief)
    println("Сезон: " + criterionSeason.winter_season)
    println("Манера вождения: " + criterionDriving.normal_driving)

    println("\n3. Третья дорожно-транспотная ситуация")
    println("Колеса: " + criterionRubber.driving_Rubber_winter)
    println("Асфальт: " + criterionAsphalt.good_asphalt)
    println("Рельеф: " + criterionRelief.horizontal_relief)
    println("Сезон: " + criterionSeason.spring_season)
    println("Манера вождения: " + criterionDriving.metropolitan_driving)

    println("\n4. Четвертая дорожно-транспотная ситуация")
    println("Колеса: " + criterionRubber.driving_Rubber_summer)
    println("Асфальт: " + criterionAsphalt.excellent_asphalt)
    println("Рельеф: " + criterionRelief.inclined_relief)
    println("Сезон: " + criterionSeason.autumn_season)
    println("Манера вождения: " + criterionDriving.northern_driving)

    println("\n5. Пятая дорожно-транспотная ситуация")
    println("Колеса: " + criterionRubber.driving_Rubber_allSeason)
    println("Асфальт: " + criterionAsphalt.bad_asphalt)
    println("Рельеф: " + criterionRelief.inclined_relief)
    println("Сезон: " + criterionSeason.summer_season)
    println("Манера вождения: " + criterionDriving.southern_driving)

    print("\nВаш выбор: ")
    var choice_1 = readLine()!!.toInt()

    if (choice_1 == 1) {
        println("Вы выбрали первую дорожно-транспотную ситуацию")
    } else if (choice_1 == 2){
        println("Вы выбрали вторую дорожно-транспотную ситуацию")
    } else if (choice_1 == 3) {
        println("Вы выбрали вторую дорожно-транспотную ситуацию")
    } else if (choice_1 == 4) {
        println("Вы выбрали вторую дорожно-транспотную ситуацию")
    } else if (choice_1 == 5) {
        println("Вы выбрали вторую дорожно-транспотную ситуацию")
    }

    println("Выберете статистику: \n")

    /*val array_2 = arrayListOf("",
        "Первая дорожно-транспотная статистика",
        "Вторая дорожно-транспотная статистика",
        "Третья дорожно-транспотная статистика",
        "Четвертая дорожно-транспотная статистика",
        "Пятая дорожно-транспотная статистика")*/
    println("Выберете дорожно-транспотную статистику: \n")

    println("1. Первая дорожно-транспотная статистика")
    println("Количество проехавшего транспорта: " + criterionNumberofCars.number_2)
    println("Количество км в сумме проехавших транспортом: " + criterionDistance.distance_3)
    println("Количество км в среднем транспорт проводит в пути: " + criterionAverageDistance.average_4)
    println("Количество транспорта останавливающегося у автозаправки: " + criterionGasStations.stations_3)

    println("\n2. Вторая дорожно-транспотная статистика")
    println("Количество проехавшего транспорта: " + criterionNumberofCars.number_1)
    println("Количество км в сумме проехавших транспортом: " + criterionDistance.distance_5)
    println("Количество км в среднем транспорт проводит в пути: " + criterionAverageDistance.average_1)
    println("Количество транспорта останавливающегося у автозаправки: " + criterionGasStations.stations_4)

    println("\n3. Третья дорожно-транспотная статистика")
    println("Количество проехавшего транспорта: " + criterionNumberofCars.number_5)
    println("Количество км в сумме проехавших транспортом: " + criterionDistance.distance_1)
    println("Количество км в среднем транспорт проводит в пути: " + criterionAverageDistance.average_2)
    println("Количество транспорта останавливающегося у автозаправки: " + criterionGasStations.stations_2)

    println("\n4. Четвертая дорожно-транспотная статистика")
    println("Количество проехавшего транспорта: " + criterionNumberofCars.number_4)
    println("Количество км в сумме проехавших транспортом: " + criterionDistance.distance_2)
    println("Количество км в среднем транспорт проводит в пути: " + criterionAverageDistance.average_1)
    println("Количество транспорта останавливающегося у автозаправки: " + criterionGasStations.stations_1)

    println("\n5. Пятая дорожно-транспотная статистика")
    println("Количество проехавшего транспорта: " + criterionNumberofCars.number_3)
    println("Количество км в сумме проехавших транспортом: " + criterionDistance.distance_4)
    println("Количество км в среднем транспорт проводит в пути: " + criterionAverageDistance.average_5)
    println("Количество транспорта останавливающегося у автозаправки: " + criterionGasStations.stations_5)

    print("\nВаш выбор: ")
    var choice_2 = readLine()!!.toInt()

    if (choice_2 == 1) {
        println("Вы выбрали первую дорожно-транспотную статистику")
    } else if (choice_2 == 2){
        println("Вы выбрали вторую дорожно-транспотную статистику")
    } else if (choice_2 == 3) {
        println("Вы выбрали вторую дорожно-транспотную статистику")
    } else if (choice_2 == 4) {
        println("Вы выбрали вторую дорожно-транспотную статистику")
    } else if (choice_2 == 5) {
        println("Вы выбрали вторую дорожно-транспотную статистику")
    }

    println(transportCar_Movement.start_of_movement)
    println(transportCar_Movement.stop_of_movement)
    println("\nДорожно-Транспортные результаты:")

    /*println("1. Машина")

    println(transportCar_Movement.start_of_movement)

    for (i in array) {
       println("Выберете колёса: ")
       println("1. Летние")
       println("2. Зимние")
       println("3. Всесезонные")
       print("Ваш выбор: ")
       val wheels = readln()!!.toString()

       print("Вы выбрали колёса: ")
       if (wheels == "Летние") {
           println(transportCar_Rubber.driving_Rubber_summer)
       } else if (wheels == "Зимние") {
           println(transportCar_Rubber.driving_Rubber_winter)
       } else if (wheels == "Всесезонные") {
           println(transportCar_Rubber.driving_Rubber_allSeason)
       } else {println("Вы выбрали непонятные колёса!!!")}

       println("Выберете асфальт: ")
       println("1. Отличный")
       println("2. Хороший")
       println("3. Плохой")
       print("Ваш выбор: ")
       val road = readln()!!.toString()

       print("Вы выбрали асфальт: ")
       if (road == "Отличный") {
           println(transportCar_Asphalt.excellent_asphalt)
       } else if (wheels == "Хороший") {
           println(transportCar_Asphalt.good_asphalt)
       } else if (wheels == "Плохой") {
           println(transportCar_Asphalt.bad_asphalt)
       } else {println("Вы выбрали непонятный асфальт!!!")}

       println("Выберете рельеф: ")
       println("1. Горизонтальный")
       println("2. Наклонный")
       println("3. Выпклый")
       print("Ваш выбор: ")
       val relief = readln()!!.toString()

       print("Вы выбрали рельеф: ")
       if (relief == "Горизонтальный") {
           println(transportCar_Relief.horizontal_relief)
       } else if (relief == "Наклонный") {
           println(transportCar_Relief.inclined_relief)
       } else if (relief == "Выпклый") {
           println(transportCar_Relief.convex_relief)
       } else {println("Вы выбрали непонятный рельеф!!!")}

       println("Выберете сезон: ")
       println("1. Зимний")
       println("2. Весенний")
       println("3. Летний")
       println("4. Осенний")
       print("Ваш выбор: ")
       val season = readln()!!.toString()

       print("Вы выбрали сезон: ")
       if (season == "Зимний") {
           println(transportCar_Season.winter_season)
       } else if (season== "Весенний") {
           println(transportCar_Season.spring_season)
       } else if (season == "Летний") {
           println(transportCar_Season.summer_season)
       }
       else if (season == "Осенний") {
           println(transportCar_Season.autumn_season)
       } else {println("Вы выбрали не верный сезон года!!!")}

       println("Выберете манеру вождения: ")
       println("1. Северная")
       println("2. Нормальная")
       println("3. Столичная")
       println("4. Южная")
       print("Ваш выбор: ")
       val driving = readln()!!.toString()

       print("Вы выбрали манеру вождения: ")
       if (driving == "Северная") {
           println(transportCar_Driving.northern_driving)
       } else if (driving== "Нормальная") {
           println(transportCar_Driving.normal_driving)
       } else if (driving == "Столичная") {
           println(transportCar_Driving.metropolitan_driving)
       }
       else if (driving == "Южная") {
           println(transportCar_Driving.southern_driving)
       } else {println("Вы выбрали непонятную манеру вождения!!!")}

       break
}
   println(transportCar_Movement.stop_of_movement)*/
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
interface numberofCars {
    val number_1: Int
    val number_2: Int
    val number_3: Int
    val number_4: Int
    val number_5: Int
}
interface Distance {
    val distance_1: Int
    val distance_2: Int
    val distance_3: Int
    val distance_4: Int
    val distance_5: Int
}

interface averageDistance {
    val average_1: Int
    val average_2: Int
    val average_3: Int
    val average_4: Int
    val average_5: Int
}

interface gasStations {
    val stations_1: Int
    val stations_2: Int
    val stations_3: Int
    val stations_4: Int
    val stations_5: Int
}
open class road_data: Rubber, Asphalt, Relief, Season, Movement, Driving, Distance, numberofCars, averageDistance, gasStations{
    override val driving_Rubber_summer = "Летние"
    override val driving_Rubber_winter = "Зимние"
    override val driving_Rubber_allSeason = "Всесезонные"

    override val excellent_asphalt = "Отличный"
    override val good_asphalt = "Хороший"
    override val bad_asphalt = "Плохой"

    override val horizontal_relief = "Горизонтальный"
    override val inclined_relief = "Наклонный"
    override val convex_relief = "Выпуклый"

    override val winter_season = "Зимний"
    override val spring_season = "Весенний"
    override val summer_season = "Летний"
    override val autumn_season = "Осенний"

    override val start_of_movement = "Начало движения"
    override val stop_of_movement = "Конец движения"

    override val northern_driving = "Северная"
    override val normal_driving = "Нормальная"
    override val metropolitan_driving = "Столичная"
    override val southern_driving = "Южная"

    override val number_1 = 10
    override val number_2 = 9
    override val number_3 = 5
    override val number_4 = 2
    override val number_5 = 1

    override val distance_1 = 100
    override val distance_2 = 80
    override val distance_3 = 50
    override val distance_4 = 10
    override val distance_5 = 5

    override val average_1 = 14
    override val average_2 = 12
    override val average_3 = 8
    override val average_4 = 4
    override val average_5 = 2

    override val stations_1 = 6
    override val stations_2 = 5
    override val stations_3 = 3
    override val stations_4 = 1
    override val stations_5 = 0

}
class car: road_data()
class bus: road_data()
class truck: road_data()
class tram: road_data()
class train: road_data()
class trolleybus: road_data()
class bicycle: road_data()
class moped: road_data()
class scooter: road_data()
class all_movement: road_data()