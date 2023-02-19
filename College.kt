package PackageCollege
open class College(_name: String, _street:String, _scores: String) {
    var name: String = _name
    var street: String = _street
    var score: String = _scores
    open fun GetInfo(){
        println("\n Название колледжа: $name\n Улица колледжа: $street \n Средний балл для поступления в колледж: $score")
    }
    open fun GetInfo1(){
        println("\n Название колледжа: $name\n Улица колледжа: $street \n Средний балл для поступления в колледж: $score")
    }
}