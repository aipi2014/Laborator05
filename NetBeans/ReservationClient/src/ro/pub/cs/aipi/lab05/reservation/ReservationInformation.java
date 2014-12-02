package ro.pub.cs.aipi.lab05.reservation;


/**
* reservation/ReservationInformation.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Reservation.idl
* Monday, November 10, 2014 3:19:56 AM EET
*/

public final class ReservationInformation implements org.omg.CORBA.portable.IDLEntity
{
  public int customerId = (int)0;
  public ro.pub.cs.aipi.lab05.reservation.Interval interval = null;
  public int numberOfSeats = (int)0;

  public ReservationInformation ()
  {
  } // ctor

  public ReservationInformation (int _customerId, ro.pub.cs.aipi.lab05.reservation.Interval _interval, int _numberOfSeats)
  {
    customerId = _customerId;
    interval = _interval;
    numberOfSeats = _numberOfSeats;
  } // ctor

} // class ReservationInformation
