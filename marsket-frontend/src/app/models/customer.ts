export class Customer {
    constructor(
        public id: number,
        public firstName: string,
        public lastName: string,
        public cpf: string,
        public haveDiscount: boolean
    ) { }
}
