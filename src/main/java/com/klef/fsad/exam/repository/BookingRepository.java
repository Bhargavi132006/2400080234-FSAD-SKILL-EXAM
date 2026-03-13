
package com.klef.fsad.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.fsad.exam.booking.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer>
{

}