import PackageCollege.College
class Entrant (name: String,street:String,score: String, var FIO:String) : College(name,street,score) {
    private var Math: Double=4.0;
    public fun SetMath():Double{
        return Math
    }
    public fun SetMath (Math: Double){
        if (Math<0){
            println("Оценка не может быть отрицательной, ваше число автоматически изменится на 4")
        }

        else{
            this.Math=Math;
        }
    }
    //////////////////////////////////////////////////////////////////////////////
    private var Physic: Double=4.0;
    public fun SetPhysic():Double{
        return Physic
    }
    public fun SetPhysic (Physic: Double){
        if (Physic<0){
            println("Оценка не может быть отрицательной, ваше число автоматически изменится на 4")
        }
        else{
            this.Physic=Physic;
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////
    private var Information: Double=4.0;
    public fun SetInformation():Double{
        return Information
    }
    public fun SetInformation (Information: Double){
        if (Information<0){
            println("Оценка не может быть отрицательной, ваше число автоматически изменится на 4")
        }
        else{
            this.Information=Information;
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////
    private var Russian: Double=4.0;
    public fun SetRussian():Double{
        return Russian
    }
    public fun SetRussian (Russian: Double){
        if (Russian<0){
            println("Оценка не может быть отрицательной, ваше число автоматически изменится на 4")
        }
        else{
            this.Russian=Russian;
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////
    private var Exmas: Double=0.0;
    open fun Exmas(){
     Exmas = (Math+Physic+Information+Russian)/4
       println("средний бал составил: $Exmas")
        if (Exmas<3.5){
            println("Извините, но вы не зачисленны в колледж!")
        }
        if (Exmas>3.6){
            println("Поздравляем вы  зачисленны в колледж! Приходите к нам 08.15.2023 чтобы получить дальнейшую информацию")
        }

    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        private var Literature: Double=4.0;
        public fun SetLiterature():Double{
            return Literature
        }
        public fun SetLiterature (Literature: Double){
            if (Literature<0){
                println("Оценка не может быть отрицательной, ваше число автоматически изменится на 4")
            }
            else{
                this.Literature=Literature;
            }
        }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private var
            Art: Double=4.0;
    public fun SetArt():Double{
        return Art
    }
    public fun SetArt (Art: Double){
        if (Art<0){
            println("Оценка не может быть отрицательной, ваше число автоматически изменится на 4")
        }
        else{
            this.Art=Art;
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private var Exmas1: Double=4.0;
    open fun Exmas1() {
        Exmas1 = (Math + Literature + Art + Russian) / 4
        println("средний бал составил: $Exmas1")
        if (Exmas1 < 3.8) {
            println("Извините, но вы не зачисленны в колледж!")
        }
        if (Exmas1 > 3.8) {
            println("Поздравляем вы  зачисленны в колледж! Приходите к нам 08.20.2023 чтобы получить дальнейшую информацию")
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    override fun GetInfo1(){
        println("\n Название колледжа: $name\n Улица колледжа: $street \n Средний балл для поступления в колледж: $score \n Фамилия и инициалы абитуриента: $FIO \n Оценка за математику: $Math \n Оценка за литературу: $Literature  \n Оценка за изо: $Art  \n Оценка за русский язык: $Russian\n Средний бал = $Exmas1")
    }
    override fun GetInfo(){
        println("\n Название колледжа: $name\n Улица колледжа: $street \n Средний балл для поступления в колледж: $score \n Фамилия и инициалы абитуриента: $FIO \n Оценка за математику: $Math \n Оценка за физику: $Physic  \n Оценка за информатику: $Information \n Оценка за русский язык: $Russian\n Средний бал = $Exmas")
    }
}