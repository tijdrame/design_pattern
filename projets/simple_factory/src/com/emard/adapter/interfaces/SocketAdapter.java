package com.emard.adapter.interfaces;

import com.emard.adapter.model.Volt;

public interface SocketAdapter {
    Volt get120Volts();
    Volt get12Volts();
    Volt get3Volts();
    Volt get1Volts();
}
