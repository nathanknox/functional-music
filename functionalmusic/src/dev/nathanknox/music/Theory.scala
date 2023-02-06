package dev.nathanknox.music

import dev.nathanknox.music.Interval.MinorSecond
import dev.nathanknox.music.Interval.PerfectUnison

sealed trait NoteLetter
object NoteLetter {
  case object C extends NoteLetter
  case object D extends NoteLetter
  case object E extends NoteLetter
  case object F extends NoteLetter
  case object G extends NoteLetter
  case object A extends NoteLetter
  case object B extends NoteLetter
}

sealed trait NoteQuality
object NoteQuality {
  case object Natural extends NoteQuality
  case object Sharp   extends NoteQuality
  case object Flat    extends NoteQuality
}

sealed trait Frequency

final case class Note(letter: NoteLetter, quality: NoteQuality, frequency: Frequency)

// final case class Scale(notes: Set[Interval])
// def

sealed trait Interval
object Interval {
  final case object PerfectUnison extends Interval
  final case object MinorSecond   extends Interval

  // final case object MajorSecond   extends Interval
  // final case object MinorThird    extends Interval
  // final case object MajorThird    extends Interval
  // final case object PerfectFourth extends Interval
  // final case object Tritone       extends Interval
  // final case object PerfectFifth  extends Interval
  // final case object MinorSixth    extends Interval
  // final case object MajorSixth    extends Interval
  // final case object MinorSeventh  extends Interval
  // final case object MajorSeventh  extends Interval
  // final case object PerfectOctave extends Interval

  // val perfectUnison = PerfectUnison
  // val minorSecond   = MinorSecond
}

object QuickTests {

  def testInterval(interval: Interval) =
    interval match {
      case PerfectUnison => ???
      case MinorSecond   => ???
    }
}
