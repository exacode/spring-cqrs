package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QRolesNameKey is a Querydsl query type for QRolesNameKey
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QRolesNameKey extends com.mysema.query.sql.RelationalPathBase<QRolesNameKey> {

    private static final long serialVersionUID = 1312710299;

    public static final QRolesNameKey rolesNameKey = new QRolesNameKey("roles_name_key");

    public final StringPath name = createString("name");

    public QRolesNameKey(String variable) {
        super(QRolesNameKey.class, forVariable(variable), "public", "roles_name_key");
    }

    @SuppressWarnings("all")
    public QRolesNameKey(Path<? extends QRolesNameKey> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "roles_name_key");
    }

    public QRolesNameKey(PathMetadata<?> metadata) {
        super(QRolesNameKey.class, metadata, "public", "roles_name_key");
    }

}

