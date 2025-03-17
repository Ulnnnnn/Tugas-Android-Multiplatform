// Kelas Orang sebagai parent class
open class Orang(val nama: String, val umur: Int)

// Kelas Dosen sebagai child class dari Orang
class Dosen(nama: String, umur: Int, val nip: String, val bidangKeahlian: String) : Orang(nama, umur) {
    // Metode untuk menampilkan profil dosen
    fun tampilkanProfil() {
        println("Name: $nama")
        println("Umur: $umur tahun")
        println("NIP: $nip")
        println("Bidang Keahlian: $bidangKeahlian")
    }
}

fun main() {
    // Membuat objek Dosen
    val dosen1 = Dosen("Dr. Andi", 16, "12345678", "Machine Learning")

    // Memanggil metode tampilkanProfil()
    dosen1.tampilkanProfil()
}
