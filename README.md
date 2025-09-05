# PBOPertemuan3
# Abstrak
Kelas abstrak adalah kelas dalam pemrograman berorientasi objek yang tidak dapat dibuat objeknya secara langsung, melainkan hanya dapat diturunkan ke kelas lain. Kelas ini digunakan sebagai kerangka dasar yang berisi metode abstrak (tanpa implementasi) dan metode konkret (dengan implementasi). Tujuan utama kelas abstrak adalah menyediakan konsep umum yang nantinya wajib diimplementasikan oleh kelas turunannya.

# Interface
Interface adalah sebuah kontrak dalam pemrograman yang berisi kumpulan metode abstrak tanpa implementasi. Semua kelas yang mengimplementasikan interface wajib menyediakan implementasi dari metode-metode tersebut. Interface biasanya digunakan untuk mendukung konsep multiple inheritance, karena sebuah kelas dapat mengimplementasikan lebih dari satu interface sekaligus.

# Perbedaan Abstrak dan Interface
Perbedaan utama terletak pada sifat dan penggunaannya. Kelas abstrak dapat memiliki atribut, konstruktor, serta metode konkret, sedangkan interface hanya berisi deklarasi metode tanpa implementasi (sebelum versi Java 8). Selain itu, sebuah kelas hanya bisa mewarisi satu kelas abstrak (single inheritance), tetapi dapat mengimplementasikan banyak interface.

# Overload (Method Overloading)
Overloading adalah konsep di mana sebuah kelas memiliki beberapa metode dengan nama yang sama, tetapi berbeda parameter (jumlah atau tipe datanya). Tujuannya adalah memberikan fleksibilitas agar satu nama metode dapat digunakan untuk berbagai kebutuhan, sehingga program menjadi lebih mudah dibaca dan dipelihara.

# Override (Method Overriding)
Overriding adalah proses mendefinisikan ulang metode dari superclass pada subclass dengan nama, parameter, dan tipe data yang sama, namun isi atau implementasinya berbeda. Override digunakan untuk menyesuaikan perilaku metode agar sesuai dengan kebutuhan spesifik pada kelas turunan.

# Perbedaan Overload dan Override
Perbedaan mendasar antara keduanya terletak pada hubungan kelas. Overloading terjadi dalam satu kelas yang sama dengan perbedaan parameter, sedangkan overriding terjadi pada dua kelas berbeda (superclass dan subclass) dengan metode yang sama. Selain itu, overloading bersifat compile-time polymorphism, sedangkan overriding merupakan runtime polymorphism.
