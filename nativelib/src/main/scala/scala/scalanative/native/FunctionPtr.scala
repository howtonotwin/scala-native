// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 1)
package scala.scalanative
package native

import scalanative.runtime.{undefined, Tag}

/** C-style function pointer. */
sealed abstract class FunctionPtr

object FunctionPtr {

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction0[R](f: Function0[R]): FunctionPtr0[R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction1[T1, R](f: Function1[T1, R]): FunctionPtr1[T1, R] =
    undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction2[T1, T2, R](
      f: Function2[T1, T2, R]): FunctionPtr2[T1, T2, R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction3[T1, T2, T3, R](
      f: Function3[T1, T2, T3, R]): FunctionPtr3[T1, T2, T3, R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction4[T1, T2, T3, T4, R](
      f: Function4[T1, T2, T3, T4, R]): FunctionPtr4[T1, T2, T3, T4, R] =
    undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction5[T1, T2, T3, T4, T5, R](
      f: Function5[T1, T2, T3, T4, T5, R])
    : FunctionPtr5[T1, T2, T3, T4, T5, R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction6[T1, T2, T3, T4, T5, T6, R](
      f: Function6[T1, T2, T3, T4, T5, T6, R])
    : FunctionPtr6[T1, T2, T3, T4, T5, T6, R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction7[T1, T2, T3, T4, T5, T6, T7, R](
      f: Function7[T1, T2, T3, T4, T5, T6, T7, R])
    : FunctionPtr7[T1, T2, T3, T4, T5, T6, T7, R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction8[T1, T2, T3, T4, T5, T6, T7, T8, R](
      f: Function8[T1, T2, T3, T4, T5, T6, T7, T8, R])
    : FunctionPtr8[T1, T2, T3, T4, T5, T6, T7, T8, R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R](
      f: Function9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R])
    : FunctionPtr9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R](
      f: Function10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R])
    : FunctionPtr10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R](
      f: Function11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R])
    : FunctionPtr11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R] =
    undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction12[T1,
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
                              R](
      f: Function12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R])
    : FunctionPtr12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R] =
    undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction13[T1,
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
                              R](f: Function13[T1,
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
                                               R]): FunctionPtr13[T1,
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
                                                                  R] =
    undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction14[T1,
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
                              R](
      f: Function14[T1,
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
                    R]): FunctionPtr14[T1,
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
                                       R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction15[T1,
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
                              R](
      f: Function15[T1,
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
                    R]): FunctionPtr15[T1,
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
                                       R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction16[T1,
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
                              R](
      f: Function16[T1,
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
                    R]): FunctionPtr16[T1,
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
                                       R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction17[T1,
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
                              R](
      f: Function17[T1,
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
                    R]): FunctionPtr17[T1,
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
                                       R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction18[T1,
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
                              R](
      f: Function18[T1,
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
                    R]): FunctionPtr18[T1,
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
                                       R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction19[T1,
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
                              R](
      f: Function19[T1,
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
                    R]): FunctionPtr19[T1,
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
                                       R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction20[T1,
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
                              R](
      f: Function20[T1,
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
                    R]): FunctionPtr20[T1,
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
                                       R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction21[T1,
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
                              R](
      f: Function21[T1,
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
                    R]): FunctionPtr21[T1,
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
                                       R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 13)

  implicit def fromFunction22[T1,
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
                              T22,
                              R](
      f: Function22[T1,
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
                    T22,
                    R]): FunctionPtr22[T1,
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
                                       T22,
                                       R] = undefined

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 17)

}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr0[R] extends FunctionPtr {
  def apply()(implicit tag1: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr1[T1, R] extends FunctionPtr {
  def apply(arg1: T1)(implicit tag1: Tag[T1], tag2: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr2[T1, T2, R] extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2)(implicit tag1: Tag[T1], tag2: Tag[T2], tag3: Tag[R]): R =
    undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr3[T1, T2, T3, R] extends FunctionPtr {
  def apply(arg1: T1, arg2: T2, arg3: T3)(implicit tag1: Tag[T1],
                                          tag2: Tag[T2],
                                          tag3: Tag[T3],
                                          tag4: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr4[T1, T2, T3, T4, R] extends FunctionPtr {
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4)(implicit tag1: Tag[T1],
                                                    tag2: Tag[T2],
                                                    tag3: Tag[T3],
                                                    tag4: Tag[T4],
                                                    tag5: Tag[R]): R =
    undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr5[T1, T2, T3, T4, T5, R] extends FunctionPtr {
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5)(
      implicit tag1: Tag[T1],
      tag2: Tag[T2],
      tag3: Tag[T3],
      tag4: Tag[T4],
      tag5: Tag[T5],
      tag6: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr6[T1, T2, T3, T4, T5, T6, R] extends FunctionPtr {
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6)(
      implicit tag1: Tag[T1],
      tag2: Tag[T2],
      tag3: Tag[T3],
      tag4: Tag[T4],
      tag5: Tag[T5],
      tag6: Tag[T6],
      tag7: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr7[T1, T2, T3, T4, T5, T6, T7, R] extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2,
            arg3: T3,
            arg4: T4,
            arg5: T5,
            arg6: T6,
            arg7: T7)(implicit tag1: Tag[T1],
                      tag2: Tag[T2],
                      tag3: Tag[T3],
                      tag4: Tag[T4],
                      tag5: Tag[T5],
                      tag6: Tag[T6],
                      tag7: Tag[T7],
                      tag8: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr8[T1, T2, T3, T4, T5, T6, T7, T8, R]
    extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2,
            arg3: T3,
            arg4: T4,
            arg5: T5,
            arg6: T6,
            arg7: T7,
            arg8: T8)(implicit tag1: Tag[T1],
                      tag2: Tag[T2],
                      tag3: Tag[T3],
                      tag4: Tag[T4],
                      tag5: Tag[T5],
                      tag6: Tag[T6],
                      tag7: Tag[T7],
                      tag8: Tag[T8],
                      tag9: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr9[T1, T2, T3, T4, T5, T6, T7, T8, T9, R]
    extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2,
            arg3: T3,
            arg4: T4,
            arg5: T5,
            arg6: T6,
            arg7: T7,
            arg8: T8,
            arg9: T9)(implicit tag1: Tag[T1],
                      tag2: Tag[T2],
                      tag3: Tag[T3],
                      tag4: Tag[T4],
                      tag5: Tag[T5],
                      tag6: Tag[T6],
                      tag7: Tag[T7],
                      tag8: Tag[T8],
                      tag9: Tag[T9],
                      tag10: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R]
    extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2,
            arg3: T3,
            arg4: T4,
            arg5: T5,
            arg6: T6,
            arg7: T7,
            arg8: T8,
            arg9: T9,
            arg10: T10)(implicit tag1: Tag[T1],
                        tag2: Tag[T2],
                        tag3: Tag[T3],
                        tag4: Tag[T4],
                        tag5: Tag[T5],
                        tag6: Tag[T6],
                        tag7: Tag[T7],
                        tag8: Tag[T8],
                        tag9: Tag[T9],
                        tag10: Tag[T10],
                        tag11: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, R]
    extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2,
            arg3: T3,
            arg4: T4,
            arg5: T5,
            arg6: T6,
            arg7: T7,
            arg8: T8,
            arg9: T9,
            arg10: T10,
            arg11: T11)(implicit tag1: Tag[T1],
                        tag2: Tag[T2],
                        tag3: Tag[T3],
                        tag4: Tag[T4],
                        tag5: Tag[T5],
                        tag6: Tag[T6],
                        tag7: Tag[T7],
                        tag8: Tag[T8],
                        tag9: Tag[T9],
                        tag10: Tag[T10],
                        tag11: Tag[T11],
                        tag12: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr12[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, R]
    extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2,
            arg3: T3,
            arg4: T4,
            arg5: T5,
            arg6: T6,
            arg7: T7,
            arg8: T8,
            arg9: T9,
            arg10: T10,
            arg11: T11,
            arg12: T12)(implicit tag1: Tag[T1],
                        tag2: Tag[T2],
                        tag3: Tag[T3],
                        tag4: Tag[T4],
                        tag5: Tag[T5],
                        tag6: Tag[T6],
                        tag7: Tag[T7],
                        tag8: Tag[T8],
                        tag9: Tag[T9],
                        tag10: Tag[T10],
                        tag11: Tag[T11],
                        tag12: Tag[T12],
                        tag13: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr13[
    T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, R]
    extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2,
            arg3: T3,
            arg4: T4,
            arg5: T5,
            arg6: T6,
            arg7: T7,
            arg8: T8,
            arg9: T9,
            arg10: T10,
            arg11: T11,
            arg12: T12,
            arg13: T13)(implicit tag1: Tag[T1],
                        tag2: Tag[T2],
                        tag3: Tag[T3],
                        tag4: Tag[T4],
                        tag5: Tag[T5],
                        tag6: Tag[T6],
                        tag7: Tag[T7],
                        tag8: Tag[T8],
                        tag9: Tag[T9],
                        tag10: Tag[T10],
                        tag11: Tag[T11],
                        tag12: Tag[T12],
                        tag13: Tag[T13],
                        tag14: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr14[
    T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, R]
    extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2,
            arg3: T3,
            arg4: T4,
            arg5: T5,
            arg6: T6,
            arg7: T7,
            arg8: T8,
            arg9: T9,
            arg10: T10,
            arg11: T11,
            arg12: T12,
            arg13: T13,
            arg14: T14)(implicit tag1: Tag[T1],
                        tag2: Tag[T2],
                        tag3: Tag[T3],
                        tag4: Tag[T4],
                        tag5: Tag[T5],
                        tag6: Tag[T6],
                        tag7: Tag[T7],
                        tag8: Tag[T8],
                        tag9: Tag[T9],
                        tag10: Tag[T10],
                        tag11: Tag[T11],
                        tag12: Tag[T12],
                        tag13: Tag[T13],
                        tag14: Tag[T14],
                        tag15: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr15[
    T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, R]
    extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2,
            arg3: T3,
            arg4: T4,
            arg5: T5,
            arg6: T6,
            arg7: T7,
            arg8: T8,
            arg9: T9,
            arg10: T10,
            arg11: T11,
            arg12: T12,
            arg13: T13,
            arg14: T14,
            arg15: T15)(implicit tag1: Tag[T1],
                        tag2: Tag[T2],
                        tag3: Tag[T3],
                        tag4: Tag[T4],
                        tag5: Tag[T5],
                        tag6: Tag[T6],
                        tag7: Tag[T7],
                        tag8: Tag[T8],
                        tag9: Tag[T9],
                        tag10: Tag[T10],
                        tag11: Tag[T11],
                        tag12: Tag[T12],
                        tag13: Tag[T13],
                        tag14: Tag[T14],
                        tag15: Tag[T15],
                        tag16: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr16[
    T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, R]
    extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2,
            arg3: T3,
            arg4: T4,
            arg5: T5,
            arg6: T6,
            arg7: T7,
            arg8: T8,
            arg9: T9,
            arg10: T10,
            arg11: T11,
            arg12: T12,
            arg13: T13,
            arg14: T14,
            arg15: T15,
            arg16: T16)(implicit tag1: Tag[T1],
                        tag2: Tag[T2],
                        tag3: Tag[T3],
                        tag4: Tag[T4],
                        tag5: Tag[T5],
                        tag6: Tag[T6],
                        tag7: Tag[T7],
                        tag8: Tag[T8],
                        tag9: Tag[T9],
                        tag10: Tag[T10],
                        tag11: Tag[T11],
                        tag12: Tag[T12],
                        tag13: Tag[T13],
                        tag14: Tag[T14],
                        tag15: Tag[T15],
                        tag16: Tag[T16],
                        tag17: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr17[T1,
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
                          R]
    extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2,
            arg3: T3,
            arg4: T4,
            arg5: T5,
            arg6: T6,
            arg7: T7,
            arg8: T8,
            arg9: T9,
            arg10: T10,
            arg11: T11,
            arg12: T12,
            arg13: T13,
            arg14: T14,
            arg15: T15,
            arg16: T16,
            arg17: T17)(implicit tag1: Tag[T1],
                        tag2: Tag[T2],
                        tag3: Tag[T3],
                        tag4: Tag[T4],
                        tag5: Tag[T5],
                        tag6: Tag[T6],
                        tag7: Tag[T7],
                        tag8: Tag[T8],
                        tag9: Tag[T9],
                        tag10: Tag[T10],
                        tag11: Tag[T11],
                        tag12: Tag[T12],
                        tag13: Tag[T13],
                        tag14: Tag[T14],
                        tag15: Tag[T15],
                        tag16: Tag[T16],
                        tag17: Tag[T17],
                        tag18: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr18[T1,
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
                          R]
    extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2,
            arg3: T3,
            arg4: T4,
            arg5: T5,
            arg6: T6,
            arg7: T7,
            arg8: T8,
            arg9: T9,
            arg10: T10,
            arg11: T11,
            arg12: T12,
            arg13: T13,
            arg14: T14,
            arg15: T15,
            arg16: T16,
            arg17: T17,
            arg18: T18)(implicit tag1: Tag[T1],
                        tag2: Tag[T2],
                        tag3: Tag[T3],
                        tag4: Tag[T4],
                        tag5: Tag[T5],
                        tag6: Tag[T6],
                        tag7: Tag[T7],
                        tag8: Tag[T8],
                        tag9: Tag[T9],
                        tag10: Tag[T10],
                        tag11: Tag[T11],
                        tag12: Tag[T12],
                        tag13: Tag[T13],
                        tag14: Tag[T14],
                        tag15: Tag[T15],
                        tag16: Tag[T16],
                        tag17: Tag[T17],
                        tag18: Tag[T18],
                        tag19: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr19[T1,
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
                          R]
    extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2,
            arg3: T3,
            arg4: T4,
            arg5: T5,
            arg6: T6,
            arg7: T7,
            arg8: T8,
            arg9: T9,
            arg10: T10,
            arg11: T11,
            arg12: T12,
            arg13: T13,
            arg14: T14,
            arg15: T15,
            arg16: T16,
            arg17: T17,
            arg18: T18,
            arg19: T19)(implicit tag1: Tag[T1],
                        tag2: Tag[T2],
                        tag3: Tag[T3],
                        tag4: Tag[T4],
                        tag5: Tag[T5],
                        tag6: Tag[T6],
                        tag7: Tag[T7],
                        tag8: Tag[T8],
                        tag9: Tag[T9],
                        tag10: Tag[T10],
                        tag11: Tag[T11],
                        tag12: Tag[T12],
                        tag13: Tag[T13],
                        tag14: Tag[T14],
                        tag15: Tag[T15],
                        tag16: Tag[T16],
                        tag17: Tag[T17],
                        tag18: Tag[T18],
                        tag19: Tag[T19],
                        tag20: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr20[T1,
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
                          R]
    extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2,
            arg3: T3,
            arg4: T4,
            arg5: T5,
            arg6: T6,
            arg7: T7,
            arg8: T8,
            arg9: T9,
            arg10: T10,
            arg11: T11,
            arg12: T12,
            arg13: T13,
            arg14: T14,
            arg15: T15,
            arg16: T16,
            arg17: T17,
            arg18: T18,
            arg19: T19,
            arg20: T20)(implicit tag1: Tag[T1],
                        tag2: Tag[T2],
                        tag3: Tag[T3],
                        tag4: Tag[T4],
                        tag5: Tag[T5],
                        tag6: Tag[T6],
                        tag7: Tag[T7],
                        tag8: Tag[T8],
                        tag9: Tag[T9],
                        tag10: Tag[T10],
                        tag11: Tag[T11],
                        tag12: Tag[T12],
                        tag13: Tag[T13],
                        tag14: Tag[T14],
                        tag15: Tag[T15],
                        tag16: Tag[T16],
                        tag17: Tag[T17],
                        tag18: Tag[T18],
                        tag19: Tag[T19],
                        tag20: Tag[T20],
                        tag21: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr21[T1,
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
                          R]
    extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2,
            arg3: T3,
            arg4: T4,
            arg5: T5,
            arg6: T6,
            arg7: T7,
            arg8: T8,
            arg9: T9,
            arg10: T10,
            arg11: T11,
            arg12: T12,
            arg13: T13,
            arg14: T14,
            arg15: T15,
            arg16: T16,
            arg17: T17,
            arg18: T18,
            arg19: T19,
            arg20: T20,
            arg21: T21)(implicit tag1: Tag[T1],
                        tag2: Tag[T2],
                        tag3: Tag[T3],
                        tag4: Tag[T4],
                        tag5: Tag[T5],
                        tag6: Tag[T6],
                        tag7: Tag[T7],
                        tag8: Tag[T8],
                        tag9: Tag[T9],
                        tag10: Tag[T10],
                        tag11: Tag[T11],
                        tag12: Tag[T12],
                        tag13: Tag[T13],
                        tag14: Tag[T14],
                        tag15: Tag[T15],
                        tag16: Tag[T16],
                        tag17: Tag[T17],
                        tag18: Tag[T18],
                        tag19: Tag[T19],
                        tag20: Tag[T20],
                        tag21: Tag[T21],
                        tag22: Tag[R]): R = undefined
}

// ###sourceLocation(file: "/Users/Denys/.src/native/nativelib/src/main/scala/scala/scalanative/native/FunctionPtr.scala.gyb", line: 24)

final class FunctionPtr22[T1,
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
                          T22,
                          R]
    extends FunctionPtr {
  def apply(arg1: T1,
            arg2: T2,
            arg3: T3,
            arg4: T4,
            arg5: T5,
            arg6: T6,
            arg7: T7,
            arg8: T8,
            arg9: T9,
            arg10: T10,
            arg11: T11,
            arg12: T12,
            arg13: T13,
            arg14: T14,
            arg15: T15,
            arg16: T16,
            arg17: T17,
            arg18: T18,
            arg19: T19,
            arg20: T20,
            arg21: T21,
            arg22: T22)(implicit tag1: Tag[T1],
                        tag2: Tag[T2],
                        tag3: Tag[T3],
                        tag4: Tag[T4],
                        tag5: Tag[T5],
                        tag6: Tag[T6],
                        tag7: Tag[T7],
                        tag8: Tag[T8],
                        tag9: Tag[T9],
                        tag10: Tag[T10],
                        tag11: Tag[T11],
                        tag12: Tag[T12],
                        tag13: Tag[T13],
                        tag14: Tag[T14],
                        tag15: Tag[T15],
                        tag16: Tag[T16],
                        tag17: Tag[T17],
                        tag18: Tag[T18],
                        tag19: Tag[T19],
                        tag20: Tag[T20],
                        tag21: Tag[T21],
                        tag22: Tag[T22],
                        tag23: Tag[R]): R = undefined
}
