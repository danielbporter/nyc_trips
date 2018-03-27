-- Tables to match fields in the raw feed files

CREATE SCHEMA IF NOT EXISTS feed;

-- VendorID,
-- tpep_pickup_datetime,
-- tpep_dropoff_datetime,
-- passenger_count,
-- trip_distance,
-- RatecodeID,
-- store_and_fwd_flag,
-- PULocationID,
-- DOLocationID,
-- payment_type,
-- fare_amount,
-- extra,
-- mta_tax,
-- tip_amount,
-- tolls_amount,
-- improvement_surcharge,
-- total_amount

CREATE TABLE feed.yellow_tripdata (
  vendor_id TEXT,
  tpep_pickup_datetime TEXT,
  tpep_dropoff_datetime TEXT,
  passenger_count TEXT,
  trip_distance TEXT,
  rate_code_id TEXT,
  store_and_fwd_flag TEXT,
  pickup_location_id TEXT,
--   pickup_longitude TEXT,
--   pickup_latitude TEXT,
  dropoff_location_id TEXT,
--   dropoff_longitude TEXT,
--   dropoff_latitude TEXT,
  payment_type TEXT,
  fare_amount TEXT,
  extra TEXT,
  mta_tax TEXT,
  tip_amount TEXT,
  tolls_amount TEXT,
  improvement_surcharge TEXT,
  total_amount TEXT
);

CREATE TABLE feed.green_tripdata (
  vendor_id TEXT,
  tpep_pickup_datetime TEXT,
  tpep_dropoff_datetime TEXT,
  passenger_count TEXT,
  trip_distance TEXT,
  pickup_longitude TEXT,
  pickup_latitude TEXT,
  rate_code_id TEXT,
  store_and_fwd_flag TEXT,
  dropoff_longitude TEXT,
  dropoff_latitude TEXT,
  payment_type TEXT,
  fare_amount TEXT,
  extra TEXT,
  mta_tax TEXT,
  improvement_surcharge TEXT,
  tip_amount TEXT,
  tolls_amount TEXT,
  total_amount TEXT,
  trip_type TEXT
);

CREATE TABLE feed.fhv_tripdata (
  dispatching_base_num TEXT,
  pickup_date TEXT,
  location_id TEXT
);

CREATE TABLE feed.taxi_zone_lookup (
  location_id TEXT,
  borough TEXT,
  zone TEXT,
  service_zone TEXT
);
