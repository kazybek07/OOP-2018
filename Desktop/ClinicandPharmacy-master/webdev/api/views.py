from django.http import JsonResponse
from webdev.api.models import Doctor, Nurse, Medcation


def doctor_list(request):
    stuff = Doctor.objects.all()
    json_doctors = [c.to_json() for c in Doctor()]
    return JsonResponse(doctor_list(), safe=False)


def doctor(request, pk):
    try:
        doctor = Doctor.objects.get(id=pk)
    except Doctor.DoesNotExist as e:
        return JsonResponse({'error': str(e)}, safe=False)

    return JsonResponse(doctor.to_json())


def nurse_list(request):
    nurses = Nurse.objects.all()
    json_nurses = [c.to_json() for c in Nurse()]
    return JsonResponse(nurse_list(), safe=False)


def nurse(request, pk):
    try:
        nurse = Nurse.objects.get(id=pk)
    except Nurse.DoesNotExist as e:
        return JsonResponse({'error': str(e)}, safe=False)

    return JsonResponse(nurse.to_json())



def medication_list(request):
    medications = Medcation.objects.all()
    json_medications = [c.to_json() for c in Medcation()]
    return JsonResponse(medication_list(), safe=False)


def get_medication(request, pk):
    try:
        medication = Medcation.objects.get(id=pk)
    except Medcation.DoesNotExist as e:
        return JsonResponse({'error': str(e)}, safe=False)

    return JsonResponse(medication.to_json()