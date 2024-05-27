package com.emard.visitor.interf;

import com.emard.visitor.model.Jacket;
import com.emard.visitor.model.Shirt;
import com.emard.visitor.model.TShirt;

public interface Visitor {
    Double visitor(Shirt shirtItem);
    Double visitor(TShirt tshirtItem);
    Double visitor(Jacket jacketItem);
}
