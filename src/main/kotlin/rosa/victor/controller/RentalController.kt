package rosa.victor.controller

import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import rosa.victor.service.RentalService

@Path("rental")
class RentalController(val rentalService: RentalService) {

    @POST
    @Path("/start/{userId}/{reservationId}")
    @Produces(MediaType.APPLICATION_JSON)
    fun startRental(userId: String, reservationId: Long) =
        rentalService.startRental(userId, reservationId)

}