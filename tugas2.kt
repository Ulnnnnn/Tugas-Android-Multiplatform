class Contact(val name: String, val phoneNumber: String) {
    override fun toString(): String {
        return "Name: $name | Nomor: $phoneNumber"
    }
}

class ContactManager {
    private val contacts = mutableListOf<Contact>()

    fun addContact(name: String, phoneNumber: String) {
        val contact = Contact(name, phoneNumber)
        contacts.add(contact)
        println("Kontak '$name' berhasil ditambahkan")
    }

    fun removeContact(name: String) {
        val contact = contacts.find { it.name == name }
        if (contact != null) {
            contacts.remove(contact)
            println(" ")
            println("Kontak '$name' berhasil dihapus")
        } else {
            println("Kontak '$name' tidak ditemukan")
        }
    }

    fun listContacts() {
        println(" ")
        println("Daftar Kontak:")
        contacts.forEach { println(it) }
    }
}

fun main() {
    val contactManager = ContactManager()

    contactManager.addContact("Andi", "08123456789")
    contactManager.addContact("Budi", "08567991234")
    contactManager.listContacts()

    contactManager.removeContact("Andi")
    contactManager.listContacts()
}
