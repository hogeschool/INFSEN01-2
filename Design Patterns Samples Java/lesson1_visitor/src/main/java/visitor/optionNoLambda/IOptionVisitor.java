/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor.optionNoLambda;



public interface IOptionVisitor<T, U> {

    U onSome(T value);

    U onNone();
}
