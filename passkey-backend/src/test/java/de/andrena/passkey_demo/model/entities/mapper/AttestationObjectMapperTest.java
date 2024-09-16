package de.andrena.passkey_demo.model.entities.mapper;

import com.yubico.webauthn.data.AttestationObject;
import com.yubico.webauthn.data.ByteArray;
import com.yubico.webauthn.data.exception.Base64UrlException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Base64;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AttestationObjectMapperTest {
    @Test
    void map() throws IOException, Base64UrlException {
        String attestationObjectAsString = "o2NmbXRkbm9uZWdhdHRTdG10oGhhdXRoRGF0YViYSZYN5YgOjGh0NBcPZHZgW4_krrmihjLHmVzzuoMdl2NdAAAAAPv8MAcVTk7MjAtuAgVX170AFEl8WPohsrEfqHZGkT8lPWzg5g9jpQECAyYgASFYIPCU9iwVXSE8CXVw-d1cnpL3yNZS17Ir2fuktqvPjrCYIlggMioP8xcxRNApEMt4llw1pskiI-llD-FytEJFJ311ZHM";

        AttestationObject attestationObject = new AttestationObject(ByteArray.fromBase64Url(attestationObjectAsString));

        assertThat(attestationObject).isNull();
    }
}
