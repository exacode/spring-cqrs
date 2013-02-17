package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QRoles is a Querydsl query type for QRoles
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QRoles extends com.mysema.query.sql.RelationalPathBase<QRoles> {

    private static final long serialVersionUID = 1548499705;

    public static final QRoles roles = new QRoles("roles");

    public final StringPath name = createString("name");

    public final NumberPath<Long> roleId = createNumber("role_id", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QRoles> rolesPkey = createPrimaryKey(roleId);

    public final com.mysema.query.sql.ForeignKey<QUserRoles> _userRolesRoleIdFkey = createInvForeignKey(roleId, "role_id");

    public final com.mysema.query.sql.ForeignKey<QRoleAuthorities> _roleAuthoritiesRoleIdFkey = createInvForeignKey(roleId, "role_id");

    public QRoles(String variable) {
        super(QRoles.class, forVariable(variable), "public", "roles");
    }

    @SuppressWarnings("all")
    public QRoles(Path<? extends QRoles> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "roles");
    }

    public QRoles(PathMetadata<?> metadata) {
        super(QRoles.class, metadata, "public", "roles");
    }

}

