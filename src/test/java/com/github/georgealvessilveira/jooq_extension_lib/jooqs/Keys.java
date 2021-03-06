/**
 * This class is generated by jOOQ
 */
package com.github.georgealvessilveira.jooq_extension_lib.jooqs;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

/**
 * A class modelling foreign key relationships between tables of the
 * <code>public</code> schema
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.7.0" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TblUsuarioRecord, Integer> IDENTITY_TBL_USUARIO = Identities0.IDENTITY_TBL_USUARIO;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TblUsuarioRecord> TBL_USUARIO_PKEY = UniqueKeys0.TBL_USUARIO_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
	public static Identity<TblUsuarioRecord, Integer> IDENTITY_TBL_USUARIO = createIdentity(TblUsuario.TBL_USUARIO,
		TblUsuario.TBL_USUARIO.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
	public static final UniqueKey<TblUsuarioRecord> TBL_USUARIO_PKEY = createUniqueKey(TblUsuario.TBL_USUARIO,
		TblUsuario.TBL_USUARIO.ID);
    }
}
