import { Employee } from './employee';
import { Customer } from './customer';
import { Product } from './product';

export class Sale {
    constructor(
        public total: number,
        public employee: Employee,
        public costumer: Customer,
        public products: Array<Product> = []
    ) { }
}
