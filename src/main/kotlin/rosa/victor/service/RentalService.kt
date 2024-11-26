package rosa.victor.service

import io.quarkus.logging.Log
import jakarta.enterprise.context.ApplicationScoped
import rosa.victor.model.Rental
import java.time.LocalDate
import java.util.concurrent.atomic.AtomicLong

@ApplicationScoped
class RentalService {

    val id: AtomicLong = AtomicLong(0)

    fun startRental(userId: String, reservationId: Long): Rental {
        Log.infof("Starting rental for %s with reservation id: %s", userId, reservationId)
        return Rental(id.incrementAndGet(), userId, reservationId, LocalDate.now())
    }
}