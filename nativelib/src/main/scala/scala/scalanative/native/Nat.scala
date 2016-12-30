package scala.scalanative
package native

/** Type-level encoding of natural numbers. */
sealed abstract class Nat
final abstract class _0 extends Nat
final abstract class _1 extends Nat
final abstract class _2 extends Nat
final abstract class _3 extends Nat
final abstract class _4 extends Nat
final abstract class _5 extends Nat
final abstract class _6 extends Nat
final abstract class _7 extends Nat
final abstract class _8 extends Nat
final abstract class _9 extends Nat
final abstract class Digit[N <: Nat, M <: Nat] extends Nat
