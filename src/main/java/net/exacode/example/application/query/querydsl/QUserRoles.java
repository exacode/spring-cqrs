package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QUserRoles is a Querydsl query type for QUserRoles
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QUserRoles extends com.mysema.query.sql.RelationalPathBase<QUserRoles> {

    private static final long serialVersionUID = -1813215250;

    public static final QUserRoles userRoles = new QUserRoles("user_roles");

    public final NumberPath<Long> roleId = createNumber("role_id", Long.class);

    public final NumberPath<Long> userId = createNumber("user_id", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QUserRoles> userRolesPkey = createPrimaryKey(userId, roleId);

    public final com.mysema.query.sql.ForeignKey<QRoles> userRolesRoleIdFkey = createForeignKey(roleId, "role_id");

    public final com.mysema.query.sql.ForeignKey<QUsers> userRolesUserIdFkey = createForeignKey(userId, "user_id");

    public QUserRoles(String variable) {
        super(QUserRoles.class, forVariable(variable), "public", "user_roles");
    }

    @SuppressWarnings("all")
    public QUserRoles(Path<? extends QUserRoles> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "user_roles");
    }

    public QUserRoles(PathMetadata<?> metadata) {
        super(QUserRoles.class, metadata, "public", "user_roles");
    }

}

