fun main(args: Array<String>) {

    var diametro = 0

    print("Digite o diâmetro do circulo: ")
    diametro = readLine()!!.toInt()

    var raio = diametro.toDouble()/2
    var pi = 3.14
    var area = (raio*raio) * pi
    var perimetro = diametro.toDouble() * pi

    print("O diâmetro do círculo é $diametro cm, sua área é igual à $area cm" +
            " e seu perímetro é igual à $perimetro cm" )




}