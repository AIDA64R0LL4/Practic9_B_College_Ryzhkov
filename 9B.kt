import PackageCollege.College
import PackageCollege.College as Entrant
fun main(){
    println("Напишите 1, если хотите узнать ифнормацию о Владиславе, который решил поступить в Екатеринбургский колледж транспортного строительства. \nНапишите 2 если хотите узнать информацию о Михаиле, который решил поступить в Свердловский колледж искусств и культуры.")
    var X = readLine()!!.toInt()
        if (X==1){
            var Math= Teacher("Кулагин Артём Вячеславович","математике")
            var Physic=Teacher("Воронов Арсений Вадимович","физике")
            var Infor=Teacher("Федорова Амина Матвеевна","информатике")
            var Russian=Teacher("Лапина Агата Артёмовна","русскому языку")
        var EKTS = College("Екатеринбургский колледж транспортного строительства", "Первомайская ул.,73", "3.6")
        EKTS.GetInfo()
        println("=================================================================================")
        var Vladisav = Entrant("Екатеринбургский колледж транспортного строительства", "Первомайская ул.,73", "3.6", "Титов Владислав Русланович")
        println("Владислав нашёл колледж, и решил сдать вступительные экзамены, средний бал которых будет влият на вашу поступление в колледж")
        println("После недельной сдачи экзаменов, Владислав сидел в ожидании результатов.Вдруг он слышишь как на его почту пришло пиьсмо 'Дзынь'.Владислав подходишь к компьютеру, и открываешь письмо")
            Math.Teacher()
        var math = readLine()!!.toDouble()
        Vladisav.SetMath(math)
       Physic.Teacher()
        var physic = readLine()!!.toDouble()
        Vladisav.SetPhysic(physic)
        Infor.Teacher()
        var inform = readLine()!!.toDouble()
        Vladisav.SetInformation(inform)
        Russian.Teacher()
        var rus = readLine()!!.toDouble()
        Vladisav.SetRussian(rus)
        Vladisav.Exmas()
        Vladisav.GetInfo()
    }
    if (X==2){
        var Math= Teacher("Артамонова Алина Глебовна","математике")
        var Liter=Teacher("Кудрявцев Никита Максимович","литературе")
        var Art=Teacher("Соболева Полина Артёмовна","изо")
        var Russian=Teacher("Иванова София Кирилловна","русскому языку")
        var EKBCOLLEGE = College("Свердловский колледж искусств и культуры", "пр. Решетникова, 5, жилой район Юго-Западный", "3.8")
        EKBCOLLEGE.GetInfo()
        println("=================================================================================")
        var Misha = Entrant("Свердловский колледж искусств и культуры", "пр. Решетникова, 5, жилой район Юго-Западный", "3.8", "Мельников Михаил Максимович")
        println("Михаил нашёл колледж, и решил сдать вступительные экзамены, средний бал которых будет влият на вашу поступление в колледж")
        println("После недельной сдачи экзаменов, Михаил сидел в ожидании результатов.Вдруг он слышишь как на его почту пришло пиьсмо 'Дзынь'.Михаил подходишь к компьютеру, и открываешь письмо")
        Math.Teacher()
        var math = readLine()!!.toDouble()
        Misha.SetMath(math)
        Liter.Teacher()
        var liter = readLine()!!.toDouble()
        Misha.SetLiterature(liter)
        Art.Teacher()
        var art = readLine()!!.toDouble()
        Misha.SetArt(art)
        Russian.Teacher()
        var rus = readLine()!!.toDouble()
        Misha.SetRussian(rus)
        Misha.Exmas1()
        Misha.GetInfo1()
    }
}


