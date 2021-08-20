object Rational extends App{
        val x = new Rational(3,4)
        val y = new Rational(5,8)
        val z = new Rational(2,7)

        println("x = " + x)
        println("x negative = " + x.neg)

        val p = x.sub(y)
        val q = p.sub(z)

        println("x - y = " + x + "-" + y + "=" + p)
        println("x - y - z = " + p + "-" + z + "="  + q)
}
class Rational(x:Int, y:Int) {
        def numer = x ;
        def denom = y ;

        def neg = new Rational(-this.numer,this.denom)

        def sub(r: Rational) =
                new Rational(numer*r.denom - r.numer*denom, denom*r.denom)

        val sign = "/"
        override def toString = s"$numer$sign$denom"
    }    