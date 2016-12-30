// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 1)
package scala.scalanative
package runtime

import scala.reflect.ClassTag
import native._

sealed abstract class Tag[P]

object Tag {
  implicit val Unit: Tag[Unit]                    = new Tag[Unit]    {}
  implicit val Boolean: Tag[Boolean]              = new Tag[Boolean] {}
  implicit val Char: Tag[Char]                    = new Tag[Char]    {}
  implicit val Byte: Tag[Byte]                    = new Tag[Byte]    {}
  implicit val UByte: Tag[UByte]                  = new Tag[UByte]   {}
  implicit val Short: Tag[Short]                  = new Tag[Short]   {}
  implicit val UShort: Tag[UShort]                = new Tag[UShort]  {}
  implicit val Int: Tag[Int]                      = new Tag[Int]     {}
  implicit val UInt: Tag[UInt]                    = new Tag[UInt]    {}
  implicit val Long: Tag[Long]                    = new Tag[Long]    {}
  implicit val ULong: Tag[ULong]                  = new Tag[ULong]   {}
  implicit val Float: Tag[Float]                  = new Tag[Float]   {}
  implicit val Double: Tag[Double]                = new Tag[Double]  {}
  implicit def Ptr[T: Tag]: Tag[Ptr[T]]           = new Tag[Ptr[T]]  {}
  implicit def Ref[T <: AnyRef: ClassTag]: Tag[T] = new Tag[T]       {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct0: Tag[CStruct0] =
    new Tag[CStruct0] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct1[T1: Tag]: Tag[CStruct1[T1]] =
    new Tag[CStruct1[T1]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct2[T1: Tag, T2: Tag]: Tag[CStruct2[T1, T2]] =
    new Tag[CStruct2[T1, T2]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct3[T1: Tag, T2: Tag, T3: Tag]: Tag[CStruct3[T1, T2, T3]] =
    new Tag[CStruct3[T1, T2, T3]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct4[T1: Tag, T2: Tag, T3: Tag, T4: Tag]
    : Tag[CStruct4[T1, T2, T3, T4]] =
    new Tag[CStruct4[T1, T2, T3, T4]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct5[T1: Tag, T2: Tag, T3: Tag, T4: Tag, T5: Tag]
    : Tag[CStruct5[T1, T2, T3, T4, T5]] =
    new Tag[CStruct5[T1, T2, T3, T4, T5]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct6[T1: Tag, T2: Tag, T3: Tag, T4: Tag, T5: Tag, T6: Tag]
    : Tag[CStruct6[T1, T2, T3, T4, T5, T6]] =
    new Tag[CStruct6[T1, T2, T3, T4, T5, T6]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct7[T1: Tag,
                        T2: Tag,
                        T3: Tag,
                        T4: Tag,
                        T5: Tag,
                        T6: Tag,
                        T7: Tag]: Tag[CStruct7[T1, T2, T3, T4, T5, T6, T7]] =
    new Tag[CStruct7[T1, T2, T3, T4, T5, T6, T7]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct8[T1: Tag,
                        T2: Tag,
                        T3: Tag,
                        T4: Tag,
                        T5: Tag,
                        T6: Tag,
                        T7: Tag,
                        T8: Tag]
    : Tag[CStruct8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new Tag[CStruct8[T1, T2, T3, T4, T5, T6, T7, T8]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct9[T1: Tag,
                        T2: Tag,
                        T3: Tag,
                        T4: Tag,
                        T5: Tag,
                        T6: Tag,
                        T7: Tag,
                        T8: Tag,
                        T9: Tag]
    : Tag[CStruct9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new Tag[CStruct9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct10[T1: Tag,
                         T2: Tag,
                         T3: Tag,
                         T4: Tag,
                         T5: Tag,
                         T6: Tag,
                         T7: Tag,
                         T8: Tag,
                         T9: Tag,
                         T10: Tag]
    : Tag[CStruct10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new Tag[CStruct10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct11[T1: Tag,
                         T2: Tag,
                         T3: Tag,
                         T4: Tag,
                         T5: Tag,
                         T6: Tag,
                         T7: Tag,
                         T8: Tag,
                         T9: Tag,
                         T10: Tag,
                         T11: Tag]
    : Tag[CStruct11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new Tag[CStruct11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct12[T1: Tag,
                         T2: Tag,
                         T3: Tag,
                         T4: Tag,
                         T5: Tag,
                         T6: Tag,
                         T7: Tag,
                         T8: Tag,
                         T9: Tag,
                         T10: Tag,
                         T11: Tag,
                         T12: Tag]
    : Tag[CStruct12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] =
    new Tag[CStruct12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct13[T1: Tag,
                         T2: Tag,
                         T3: Tag,
                         T4: Tag,
                         T5: Tag,
                         T6: Tag,
                         T7: Tag,
                         T8: Tag,
                         T9: Tag,
                         T10: Tag,
                         T11: Tag,
                         T12: Tag,
                         T13: Tag]
    : Tag[CStruct13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] =
    new Tag[CStruct13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct14[T1: Tag,
                         T2: Tag,
                         T3: Tag,
                         T4: Tag,
                         T5: Tag,
                         T6: Tag,
                         T7: Tag,
                         T8: Tag,
                         T9: Tag,
                         T10: Tag,
                         T11: Tag,
                         T12: Tag,
                         T13: Tag,
                         T14: Tag]: Tag[
    CStruct14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] =
    new Tag[CStruct14[T1,
                      T2,
                      T3,
                      T4,
                      T5,
                      T6,
                      T7,
                      T8,
                      T9,
                      T10,
                      T11,
                      T12,
                      T13,
                      T14]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct15[T1: Tag,
                         T2: Tag,
                         T3: Tag,
                         T4: Tag,
                         T5: Tag,
                         T6: Tag,
                         T7: Tag,
                         T8: Tag,
                         T9: Tag,
                         T10: Tag,
                         T11: Tag,
                         T12: Tag,
                         T13: Tag,
                         T14: Tag,
                         T15: Tag]: Tag[
    CStruct15[T1,
              T2,
              T3,
              T4,
              T5,
              T6,
              T7,
              T8,
              T9,
              T10,
              T11,
              T12,
              T13,
              T14,
              T15]] =
    new Tag[
      CStruct15[T1,
                T2,
                T3,
                T4,
                T5,
                T6,
                T7,
                T8,
                T9,
                T10,
                T11,
                T12,
                T13,
                T14,
                T15]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct16[T1: Tag,
                         T2: Tag,
                         T3: Tag,
                         T4: Tag,
                         T5: Tag,
                         T6: Tag,
                         T7: Tag,
                         T8: Tag,
                         T9: Tag,
                         T10: Tag,
                         T11: Tag,
                         T12: Tag,
                         T13: Tag,
                         T14: Tag,
                         T15: Tag,
                         T16: Tag]: Tag[
    CStruct16[T1,
              T2,
              T3,
              T4,
              T5,
              T6,
              T7,
              T8,
              T9,
              T10,
              T11,
              T12,
              T13,
              T14,
              T15,
              T16]] =
    new Tag[
      CStruct16[T1,
                T2,
                T3,
                T4,
                T5,
                T6,
                T7,
                T8,
                T9,
                T10,
                T11,
                T12,
                T13,
                T14,
                T15,
                T16]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct17[T1: Tag,
                         T2: Tag,
                         T3: Tag,
                         T4: Tag,
                         T5: Tag,
                         T6: Tag,
                         T7: Tag,
                         T8: Tag,
                         T9: Tag,
                         T10: Tag,
                         T11: Tag,
                         T12: Tag,
                         T13: Tag,
                         T14: Tag,
                         T15: Tag,
                         T16: Tag,
                         T17: Tag]: Tag[
    CStruct17[T1,
              T2,
              T3,
              T4,
              T5,
              T6,
              T7,
              T8,
              T9,
              T10,
              T11,
              T12,
              T13,
              T14,
              T15,
              T16,
              T17]] =
    new Tag[
      CStruct17[T1,
                T2,
                T3,
                T4,
                T5,
                T6,
                T7,
                T8,
                T9,
                T10,
                T11,
                T12,
                T13,
                T14,
                T15,
                T16,
                T17]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct18[T1: Tag,
                         T2: Tag,
                         T3: Tag,
                         T4: Tag,
                         T5: Tag,
                         T6: Tag,
                         T7: Tag,
                         T8: Tag,
                         T9: Tag,
                         T10: Tag,
                         T11: Tag,
                         T12: Tag,
                         T13: Tag,
                         T14: Tag,
                         T15: Tag,
                         T16: Tag,
                         T17: Tag,
                         T18: Tag]: Tag[
    CStruct18[T1,
              T2,
              T3,
              T4,
              T5,
              T6,
              T7,
              T8,
              T9,
              T10,
              T11,
              T12,
              T13,
              T14,
              T15,
              T16,
              T17,
              T18]] =
    new Tag[
      CStruct18[T1,
                T2,
                T3,
                T4,
                T5,
                T6,
                T7,
                T8,
                T9,
                T10,
                T11,
                T12,
                T13,
                T14,
                T15,
                T16,
                T17,
                T18]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct19[T1: Tag,
                         T2: Tag,
                         T3: Tag,
                         T4: Tag,
                         T5: Tag,
                         T6: Tag,
                         T7: Tag,
                         T8: Tag,
                         T9: Tag,
                         T10: Tag,
                         T11: Tag,
                         T12: Tag,
                         T13: Tag,
                         T14: Tag,
                         T15: Tag,
                         T16: Tag,
                         T17: Tag,
                         T18: Tag,
                         T19: Tag]: Tag[
    CStruct19[T1,
              T2,
              T3,
              T4,
              T5,
              T6,
              T7,
              T8,
              T9,
              T10,
              T11,
              T12,
              T13,
              T14,
              T15,
              T16,
              T17,
              T18,
              T19]] =
    new Tag[
      CStruct19[T1,
                T2,
                T3,
                T4,
                T5,
                T6,
                T7,
                T8,
                T9,
                T10,
                T11,
                T12,
                T13,
                T14,
                T15,
                T16,
                T17,
                T18,
                T19]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct20[T1: Tag,
                         T2: Tag,
                         T3: Tag,
                         T4: Tag,
                         T5: Tag,
                         T6: Tag,
                         T7: Tag,
                         T8: Tag,
                         T9: Tag,
                         T10: Tag,
                         T11: Tag,
                         T12: Tag,
                         T13: Tag,
                         T14: Tag,
                         T15: Tag,
                         T16: Tag,
                         T17: Tag,
                         T18: Tag,
                         T19: Tag,
                         T20: Tag]: Tag[
    CStruct20[T1,
              T2,
              T3,
              T4,
              T5,
              T6,
              T7,
              T8,
              T9,
              T10,
              T11,
              T12,
              T13,
              T14,
              T15,
              T16,
              T17,
              T18,
              T19,
              T20]] =
    new Tag[
      CStruct20[T1,
                T2,
                T3,
                T4,
                T5,
                T6,
                T7,
                T8,
                T9,
                T10,
                T11,
                T12,
                T13,
                T14,
                T15,
                T16,
                T17,
                T18,
                T19,
                T20]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct21[T1: Tag,
                         T2: Tag,
                         T3: Tag,
                         T4: Tag,
                         T5: Tag,
                         T6: Tag,
                         T7: Tag,
                         T8: Tag,
                         T9: Tag,
                         T10: Tag,
                         T11: Tag,
                         T12: Tag,
                         T13: Tag,
                         T14: Tag,
                         T15: Tag,
                         T16: Tag,
                         T17: Tag,
                         T18: Tag,
                         T19: Tag,
                         T20: Tag,
                         T21: Tag]: Tag[
    CStruct21[T1,
              T2,
              T3,
              T4,
              T5,
              T6,
              T7,
              T8,
              T9,
              T10,
              T11,
              T12,
              T13,
              T14,
              T15,
              T16,
              T17,
              T18,
              T19,
              T20,
              T21]] =
    new Tag[
      CStruct21[T1,
                T2,
                T3,
                T4,
                T5,
                T6,
                T7,
                T8,
                T9,
                T10,
                T11,
                T12,
                T13,
                T14,
                T15,
                T16,
                T17,
                T18,
                T19,
                T20,
                T21]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 30)

  implicit def CStruct22[T1: Tag,
                         T2: Tag,
                         T3: Tag,
                         T4: Tag,
                         T5: Tag,
                         T6: Tag,
                         T7: Tag,
                         T8: Tag,
                         T9: Tag,
                         T10: Tag,
                         T11: Tag,
                         T12: Tag,
                         T13: Tag,
                         T14: Tag,
                         T15: Tag,
                         T16: Tag,
                         T17: Tag,
                         T18: Tag,
                         T19: Tag,
                         T20: Tag,
                         T21: Tag,
                         T22: Tag]: Tag[
    CStruct22[T1,
              T2,
              T3,
              T4,
              T5,
              T6,
              T7,
              T8,
              T9,
              T10,
              T11,
              T12,
              T13,
              T14,
              T15,
              T16,
              T17,
              T18,
              T19,
              T20,
              T21,
              T22]] =
    new Tag[
      CStruct22[T1,
                T2,
                T3,
                T4,
                T5,
                T6,
                T7,
                T8,
                T9,
                T10,
                T11,
                T12,
                T13,
                T14,
                T15,
                T16,
                T17,
                T18,
                T19,
                T20,
                T21,
                T22]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 35)

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion0: Tag[CUnion0] =
    new Tag[CUnion0] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion1[T1: Tag]: Tag[CUnion1[T1]] =
    new Tag[CUnion1[T1]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion2[T1: Tag, T2: Tag]: Tag[CUnion2[T1, T2]] =
    new Tag[CUnion2[T1, T2]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion3[T1: Tag, T2: Tag, T3: Tag]: Tag[CUnion3[T1, T2, T3]] =
    new Tag[CUnion3[T1, T2, T3]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion4[T1: Tag, T2: Tag, T3: Tag, T4: Tag]
    : Tag[CUnion4[T1, T2, T3, T4]] =
    new Tag[CUnion4[T1, T2, T3, T4]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion5[T1: Tag, T2: Tag, T3: Tag, T4: Tag, T5: Tag]
    : Tag[CUnion5[T1, T2, T3, T4, T5]] =
    new Tag[CUnion5[T1, T2, T3, T4, T5]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion6[T1: Tag, T2: Tag, T3: Tag, T4: Tag, T5: Tag, T6: Tag]
    : Tag[CUnion6[T1, T2, T3, T4, T5, T6]] =
    new Tag[CUnion6[T1, T2, T3, T4, T5, T6]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion7[T1: Tag,
                       T2: Tag,
                       T3: Tag,
                       T4: Tag,
                       T5: Tag,
                       T6: Tag,
                       T7: Tag]: Tag[CUnion7[T1, T2, T3, T4, T5, T6, T7]] =
    new Tag[CUnion7[T1, T2, T3, T4, T5, T6, T7]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion8[T1: Tag,
                       T2: Tag,
                       T3: Tag,
                       T4: Tag,
                       T5: Tag,
                       T6: Tag,
                       T7: Tag,
                       T8: Tag]: Tag[CUnion8[T1, T2, T3, T4, T5, T6, T7, T8]] =
    new Tag[CUnion8[T1, T2, T3, T4, T5, T6, T7, T8]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion9[T1: Tag,
                       T2: Tag,
                       T3: Tag,
                       T4: Tag,
                       T5: Tag,
                       T6: Tag,
                       T7: Tag,
                       T8: Tag,
                       T9: Tag]
    : Tag[CUnion9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] =
    new Tag[CUnion9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion10[T1: Tag,
                        T2: Tag,
                        T3: Tag,
                        T4: Tag,
                        T5: Tag,
                        T6: Tag,
                        T7: Tag,
                        T8: Tag,
                        T9: Tag,
                        T10: Tag]
    : Tag[CUnion10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] =
    new Tag[CUnion10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion11[T1: Tag,
                        T2: Tag,
                        T3: Tag,
                        T4: Tag,
                        T5: Tag,
                        T6: Tag,
                        T7: Tag,
                        T8: Tag,
                        T9: Tag,
                        T10: Tag,
                        T11: Tag]
    : Tag[CUnion11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] =
    new Tag[CUnion11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion12[T1: Tag,
                        T2: Tag,
                        T3: Tag,
                        T4: Tag,
                        T5: Tag,
                        T6: Tag,
                        T7: Tag,
                        T8: Tag,
                        T9: Tag,
                        T10: Tag,
                        T11: Tag,
                        T12: Tag]
    : Tag[CUnion12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] =
    new Tag[CUnion12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion13[T1: Tag,
                        T2: Tag,
                        T3: Tag,
                        T4: Tag,
                        T5: Tag,
                        T6: Tag,
                        T7: Tag,
                        T8: Tag,
                        T9: Tag,
                        T10: Tag,
                        T11: Tag,
                        T12: Tag,
                        T13: Tag]
    : Tag[CUnion13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] =
    new Tag[CUnion13[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion14[T1: Tag,
                        T2: Tag,
                        T3: Tag,
                        T4: Tag,
                        T5: Tag,
                        T6: Tag,
                        T7: Tag,
                        T8: Tag,
                        T9: Tag,
                        T10: Tag,
                        T11: Tag,
                        T12: Tag,
                        T13: Tag,
                        T14: Tag]: Tag[
    CUnion14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] =
    new Tag[
      CUnion14[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion15[T1: Tag,
                        T2: Tag,
                        T3: Tag,
                        T4: Tag,
                        T5: Tag,
                        T6: Tag,
                        T7: Tag,
                        T8: Tag,
                        T9: Tag,
                        T10: Tag,
                        T11: Tag,
                        T12: Tag,
                        T13: Tag,
                        T14: Tag,
                        T15: Tag]
    : Tag[
      CUnion15[T1,
               T2,
               T3,
               T4,
               T5,
               T6,
               T7,
               T8,
               T9,
               T10,
               T11,
               T12,
               T13,
               T14,
               T15]] =
    new Tag[
      CUnion15[T1,
               T2,
               T3,
               T4,
               T5,
               T6,
               T7,
               T8,
               T9,
               T10,
               T11,
               T12,
               T13,
               T14,
               T15]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion16[T1: Tag,
                        T2: Tag,
                        T3: Tag,
                        T4: Tag,
                        T5: Tag,
                        T6: Tag,
                        T7: Tag,
                        T8: Tag,
                        T9: Tag,
                        T10: Tag,
                        T11: Tag,
                        T12: Tag,
                        T13: Tag,
                        T14: Tag,
                        T15: Tag,
                        T16: Tag]: Tag[
    CUnion16[T1,
             T2,
             T3,
             T4,
             T5,
             T6,
             T7,
             T8,
             T9,
             T10,
             T11,
             T12,
             T13,
             T14,
             T15,
             T16]] =
    new Tag[
      CUnion16[T1,
               T2,
               T3,
               T4,
               T5,
               T6,
               T7,
               T8,
               T9,
               T10,
               T11,
               T12,
               T13,
               T14,
               T15,
               T16]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion17[T1: Tag,
                        T2: Tag,
                        T3: Tag,
                        T4: Tag,
                        T5: Tag,
                        T6: Tag,
                        T7: Tag,
                        T8: Tag,
                        T9: Tag,
                        T10: Tag,
                        T11: Tag,
                        T12: Tag,
                        T13: Tag,
                        T14: Tag,
                        T15: Tag,
                        T16: Tag,
                        T17: Tag]: Tag[
    CUnion17[T1,
             T2,
             T3,
             T4,
             T5,
             T6,
             T7,
             T8,
             T9,
             T10,
             T11,
             T12,
             T13,
             T14,
             T15,
             T16,
             T17]] =
    new Tag[
      CUnion17[T1,
               T2,
               T3,
               T4,
               T5,
               T6,
               T7,
               T8,
               T9,
               T10,
               T11,
               T12,
               T13,
               T14,
               T15,
               T16,
               T17]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion18[T1: Tag,
                        T2: Tag,
                        T3: Tag,
                        T4: Tag,
                        T5: Tag,
                        T6: Tag,
                        T7: Tag,
                        T8: Tag,
                        T9: Tag,
                        T10: Tag,
                        T11: Tag,
                        T12: Tag,
                        T13: Tag,
                        T14: Tag,
                        T15: Tag,
                        T16: Tag,
                        T17: Tag,
                        T18: Tag]: Tag[
    CUnion18[T1,
             T2,
             T3,
             T4,
             T5,
             T6,
             T7,
             T8,
             T9,
             T10,
             T11,
             T12,
             T13,
             T14,
             T15,
             T16,
             T17,
             T18]] =
    new Tag[
      CUnion18[T1,
               T2,
               T3,
               T4,
               T5,
               T6,
               T7,
               T8,
               T9,
               T10,
               T11,
               T12,
               T13,
               T14,
               T15,
               T16,
               T17,
               T18]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion19[T1: Tag,
                        T2: Tag,
                        T3: Tag,
                        T4: Tag,
                        T5: Tag,
                        T6: Tag,
                        T7: Tag,
                        T8: Tag,
                        T9: Tag,
                        T10: Tag,
                        T11: Tag,
                        T12: Tag,
                        T13: Tag,
                        T14: Tag,
                        T15: Tag,
                        T16: Tag,
                        T17: Tag,
                        T18: Tag,
                        T19: Tag]: Tag[
    CUnion19[T1,
             T2,
             T3,
             T4,
             T5,
             T6,
             T7,
             T8,
             T9,
             T10,
             T11,
             T12,
             T13,
             T14,
             T15,
             T16,
             T17,
             T18,
             T19]] =
    new Tag[
      CUnion19[T1,
               T2,
               T3,
               T4,
               T5,
               T6,
               T7,
               T8,
               T9,
               T10,
               T11,
               T12,
               T13,
               T14,
               T15,
               T16,
               T17,
               T18,
               T19]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion20[T1: Tag,
                        T2: Tag,
                        T3: Tag,
                        T4: Tag,
                        T5: Tag,
                        T6: Tag,
                        T7: Tag,
                        T8: Tag,
                        T9: Tag,
                        T10: Tag,
                        T11: Tag,
                        T12: Tag,
                        T13: Tag,
                        T14: Tag,
                        T15: Tag,
                        T16: Tag,
                        T17: Tag,
                        T18: Tag,
                        T19: Tag,
                        T20: Tag]: Tag[
    CUnion20[T1,
             T2,
             T3,
             T4,
             T5,
             T6,
             T7,
             T8,
             T9,
             T10,
             T11,
             T12,
             T13,
             T14,
             T15,
             T16,
             T17,
             T18,
             T19,
             T20]] =
    new Tag[
      CUnion20[T1,
               T2,
               T3,
               T4,
               T5,
               T6,
               T7,
               T8,
               T9,
               T10,
               T11,
               T12,
               T13,
               T14,
               T15,
               T16,
               T17,
               T18,
               T19,
               T20]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion21[T1: Tag,
                        T2: Tag,
                        T3: Tag,
                        T4: Tag,
                        T5: Tag,
                        T6: Tag,
                        T7: Tag,
                        T8: Tag,
                        T9: Tag,
                        T10: Tag,
                        T11: Tag,
                        T12: Tag,
                        T13: Tag,
                        T14: Tag,
                        T15: Tag,
                        T16: Tag,
                        T17: Tag,
                        T18: Tag,
                        T19: Tag,
                        T20: Tag,
                        T21: Tag]: Tag[
    CUnion21[T1,
             T2,
             T3,
             T4,
             T5,
             T6,
             T7,
             T8,
             T9,
             T10,
             T11,
             T12,
             T13,
             T14,
             T15,
             T16,
             T17,
             T18,
             T19,
             T20,
             T21]] =
    new Tag[
      CUnion21[T1,
               T2,
               T3,
               T4,
               T5,
               T6,
               T7,
               T8,
               T9,
               T10,
               T11,
               T12,
               T13,
               T14,
               T15,
               T16,
               T17,
               T18,
               T19,
               T20,
               T21]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 40)

  implicit def CUnion22[T1: Tag,
                        T2: Tag,
                        T3: Tag,
                        T4: Tag,
                        T5: Tag,
                        T6: Tag,
                        T7: Tag,
                        T8: Tag,
                        T9: Tag,
                        T10: Tag,
                        T11: Tag,
                        T12: Tag,
                        T13: Tag,
                        T14: Tag,
                        T15: Tag,
                        T16: Tag,
                        T17: Tag,
                        T18: Tag,
                        T19: Tag,
                        T20: Tag,
                        T21: Tag,
                        T22: Tag]: Tag[
    CUnion22[T1,
             T2,
             T3,
             T4,
             T5,
             T6,
             T7,
             T8,
             T9,
             T10,
             T11,
             T12,
             T13,
             T14,
             T15,
             T16,
             T17,
             T18,
             T19,
             T20,
             T21,
             T22]] =
    new Tag[
      CUnion22[T1,
               T2,
               T3,
               T4,
               T5,
               T6,
               T7,
               T8,
               T9,
               T10,
               T11,
               T12,
               T13,
               T14,
               T15,
               T16,
               T17,
               T18,
               T19,
               T20,
               T21,
               T22]] {}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/runtime/Tag.scala.gyb", line: 45)
}
