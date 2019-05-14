export interface IAuthResponse{
  token: string;
}

export interface Nurse {
  name: string;
  surname: string;
  department: string
}

export interface Medcation {
  denotation: string;
  group: string;
  manufacturer_country: string;
  made_on: Date;
  due_on: Date;
}
