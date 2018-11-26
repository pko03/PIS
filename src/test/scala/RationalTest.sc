
class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n/g
  val denom: Int = d/g
  def this(n: Int) = this(n, 1) // auxiliary constructor
  override def toString = numer + "/" + denom
  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + denom * that.numer ,
      denom * that.denom
    )

  def lessThan(that: Rational) = this.denom * that.numer > this.numer * that.denom

  def max(that: Rational) = if(this lessThan that) that else this

  private def gcd(a: Int, b: Int): Int = {
    if(b == 0) a else gcd(b, a % b)
  }
}



val oneHalf = new Rational(1, 2)


val twoThirds = new Rational(2, 3)

oneHalf add twoThirds


val r = new Rational(1, 2)

r.numer

r.denom

oneHalf lessThan twoThirds
oneHalf max twoThirds


val y = new Rational(3)

new Rational(66, 42)

