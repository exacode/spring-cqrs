package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QRolesPkey is a Querydsl query type for QRolesPkey
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QRolesPkey extends com.mysema.query.sql.RelationalPathBase<QRolesPkey> {

    private static final long serialVersionUID = -1787161976;

    public static final QRolesPkey rolesPkey = new QRolesPkey("roles_pkey");

    public final NumberPath<Long> roleId = createNumber("role_id", Long.class);

    public QRolesPkey(String variable) {
        super(QRolesPkey.class, forVariable(variable), "public", "roles_pkey");
    }

    @SuppressWarnings("all")
    public QRolesPkey(Path<? extends QRolesPkey> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "roles_pkey");
    }

    public QRolesPkey(PathMetadata<?> metadata) {
        super(QRolesPkey.class, metadata, "public", "roles_pkey");
    }

}

