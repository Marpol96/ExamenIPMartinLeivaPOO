class Elevador() {
    // status
    var Direccion: String? = null
    var status:Int=1
    var lugar: Int=0
    var LugarAir: Int =0
    var namelugar: String = ""
    fun showStatus() {
        if (status == 1) {
            println("El Elevador Esta Detenido en el, $namelugar")
        } else if (status == 2) {
            println("Estado del elevador, ARRIBA, en el $namelugar")
        } else if (status == 3) {
            println("Estado del elevador, ABAJO, en el $namelugar")
        }else{
            println("El Elevador No Sirve XD")
        }
    }
        fun llenarpisos() {
            if (lugar == 1) {
                namelugar = "Sotano 3"
                status=3
            } else if (lugar == 2) {
                namelugar = "Sotano 2"
                status=3
            } else if (lugar == 3) {
                namelugar = "Sotano 1"
                status=3
            } else if (lugar == 4) {
                namelugar = "Lobby"
                status=1
            } else if (lugar == 5) {
                namelugar = "Piso 1"
                status=2
            } else if (lugar == 6) {
                namelugar = "Piso 2"
                status=2
            } else if (lugar == 7) {
                namelugar = "Piso 3"
                status=2
            } else if (lugar == 8) {
                namelugar = "Piso 4"
                status=2
            } else if (lugar == 9) {
                namelugar = "Piso 5"
                status=2
            } else if (lugar == 10) {
                namelugar = "Piso 6"
                status=2
            } else if (lugar == 11) {
                namelugar = "Piso 7"
                status=2
            } else if (lugar == 12) {
                namelugar = "Piso 8"
                status=2
            } else if (lugar == 13) {
                namelugar = "Piso 9"
                status=2
            } else if (lugar == 14) {
                namelugar = "Piso 10"
                status=2
            } else if (lugar == 15) {
                namelugar = "Piso 11"
                status=2
            } else if (lugar == 16) {
                namelugar = "Piso 12"
                status=2
            }else{
                print("Piso Inexistente")
            }
        }
    fun PedirDireccion(){
        println("-Ingrese El Piso Al Que Desea Ir: ")
        Direccion = readLine()
    }

    fun BuscarPiso(){

        if((Direccion=="1")or(Direccion=="Piso 1")or(Direccion=="P1")or(Direccion=="p1")){

        }
    }
}