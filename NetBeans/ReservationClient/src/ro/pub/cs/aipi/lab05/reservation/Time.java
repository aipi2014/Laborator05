package ro.pub.cs.aipi.lab05.reservation;


/**
* reservation/Time.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Reservation.idl
* Monday, November 10, 2014 3:19:56 AM EET
*/

public final class Time implements org.omg.CORBA.portable.IDLEntity
{
  public ro.pub.cs.aipi.lab05.reservation.Date date = null;
  public ro.pub.cs.aipi.lab05.reservation.Moment moment = null;

  public Time ()
  {
  } // ctor

  public Time (ro.pub.cs.aipi.lab05.reservation.Date _date, ro.pub.cs.aipi.lab05.reservation.Moment _moment)
  {
    date = _date;
    moment = _moment;
  } // ctor

} // class Time