class Elevador(val Direccion: Int) {
    // status
    val status:Int=1
    val lugar: Int=0
    val LugarAir: Int =0
    var namelugar: String = ""
    fun showStatus() {
        if (status == 1) {
            println("El Elevador Esta Detenido en el, ", namelugar)
        } else if (status == 2) {
            println("Estado del elevador, ARRIBA, en el ", namelugar)
        } else if (status == 3) {
            println("Estado del elevador, ABAJO, en el ", namelugar)
        }else{
            println("El Elevador No Sirve XD")
        }
    }
        fun llenarpisos() {
            if (lugar == 1) {
                namelugar = "Sotano 3"
            } else if (lugar == 2) {
                namelugar = "Sotano 2"
            } else if (lugar == 3) {
                namelugar = "Sotano 1"
            } else if (lugar == 4) {
                namelugar = "Lobby"
            } else if (lugar == 5) {
                namelugar = "Piso 1"
            } else if (lugar == 6) {
                namelugar = "Piso 2"
            } else if (lugar == 7) {
                namelugar = "Piso 3"
            } else if (lugar == 8) {
                namelugar = "Piso 4"
            } else if (lugar == 9) {
                namelugar = "Piso 5"
            } else if (lugar == 10) {
                namelugar = "Piso 6"
            } else if (lugar == 11) {
                namelugar = "Piso 7"
            } else if (lugar == 12) {
                namelugar = "Piso 8"
            } else if (lugar == 13) {
                namelugar = "Piso 9"
            } else if (lugar == 14) {
                namelugar = "Piso 10"
            } else if (lugar == 15) {
                namelugar = "Piso 11"
            } else if (lugar == 16) {
                namelugar = "Piso 12"
            }else{
                print("Piso Inexistente")
            }
        }
    fun PedirDireccion(){
        println("--")
    }
}