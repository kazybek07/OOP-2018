from django.db import models

# Create your models here.

class Doctor(models.Model):
    name = models.CharField(max_length=200)
    surname = models.CharField(max_length=200)
    department = models.CharField(max_length=200)

    def __str__(self):
        return '{}: {}'.format(self.id, self.name)

    def to_json(self):
        return {
            'id': self.id,
            'name': self.name
        }

class Nurse(models.Model):
    name = models.CharField(max_length=200)
    surname = models.CharField(max_length=200)
    department = models.CharField(max_length=200)
    to_doctor = models.ForeignKey(Doctor, on_delete=models.CASCADE())

    def __str__(self):
        return '{}: {}'.format(self.id, self.name)

    def to_json(self):
        return {
            'id': self.id,
            'name': self.name,
            'department': self.department,
            'to_doctor': self.to_doctor
        }

class Medcation(models.Model):
    denotation = models.CharField(max_length=200)
    group = models.CharField(max_length=200)
    manufacturer_country = models.CharField(max_length=200)
    made_on = models.DateTimeField(auto_now=False, editable=True)
    due_on = models.DateTimeField(auto_now=False, editable=True)

    def __str__(self):
        return '{}: {}'.format(self.id, self.denotation)

    def to_json(self):
        return {
            'id': self.id,
            'denotation': self.denotation,
            'group': self.group,
            'due_on': self.due_on
        }

