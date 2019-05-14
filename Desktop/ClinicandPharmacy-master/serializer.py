from rest_framework import serializers
from django.contrib.auth.models import User
from .models import Doctor, Nurse, Medication

class DoctorSerializer(serializers.ModelSerializer):
    class Meta:
        model = Doctor
        fields = ('__all__')

class NurseSerializer(serializers.Serializer):
    class Meta:
        model = Nurse
        fields = ('__all__')

class MedicationSerializer(serializers.ModelSerializer):
    class Meta:
        model = User
        fields = ('__all__')