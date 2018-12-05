
export class Product {
    constructor(
        public id: number,
        public barCode: string,
        public name: string,
        public price: number,
        public quantity: number,
        public haveDiscount: boolean
    ) {}


}
