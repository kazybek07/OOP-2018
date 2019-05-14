from django.urls import *
from api import views

urlpatterns = [
    path('api/doctors', views.get_doctors_list)
]