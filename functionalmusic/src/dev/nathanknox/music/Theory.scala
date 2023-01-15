package dev.nathanknox.music

sealed trait NoteName
object NoteName {
  case object C extends NoteName
  case object D extends NoteName
  case object E extends NoteName
  case object F extends NoteName
  case object G extends NoteName
  case object A extends NoteName
  case object B extends NoteName
}

sealed trait Interval
object Interval {
  case object Unison extends Interval
  case object MinorSecond extends Interval
}
