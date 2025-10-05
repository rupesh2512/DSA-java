import phonenumbers
from phonenumbers import geocoder, carrier

number = "+919580562196"

pepnumber = phonenumbers.parse(number)
location = geocoder.description_for_number(pepnumber, "en")
print(location)

service = phonenumbers.parse(number)
print(carrier.name_for_number(service, "en"))

import opencage
from opencage.geocoder import OpenCageGeocode

key = "1bfeb72b3ef5403aa2dd31fe0d1e910b"

geocoder = OpenCageGeocode(key)
query = str(location)
result = geocoder.geocode(query)

# print(result)

lat = result[0]['geometry']['lat']
lng = result[0]['geometry']['lng']

print(lat, lng)

import folium

my_map = folium.Map(location=[lat, lng], zoom_start=9)
folium.Marker([lat, lng], popup=location).add_to(my_map)

my_map.save("mylocation.html")

