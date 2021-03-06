package model

/**
  * "id"
  * "airport_ref"
  * "airport_ident"
  * "length_ft"
  * "width_ft"
  * "surface"
  * "lighted"
  * "closed"
  * "le_ident"
  * "le_latitude_deg"
  * "le_longitude_deg"
  * "le_elevation_ft"
  * "le_heading_degT"
  * "le_displaced_threshold_ft"
  * "he_ident"
  * "he_latitude_deg"
  * "he_longitude_deg"
  * "he_elevation_ft"
  * "he_heading_degT"
  * "he_displaced_threshold_ft"*
  */
case class Runaway(id: Int, airportRef: Int, airportIdent: String, length: Int, width: Int, surface: String,
                   lighted: Boolean, closed: Boolean, leIdent: String, leLat: Double, leLon: Double,
                   leElevation: Int, leHeading: Double, leDisplacedThreshold: Int, heIdent: String,
                   heLat: Double, heLon: Double, heElevation: Int, heHeading: Double, heDisplacedThreshold: Int) {

}
