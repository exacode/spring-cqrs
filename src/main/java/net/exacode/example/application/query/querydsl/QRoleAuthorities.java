package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QRoleAuthorities is a Querydsl query type for QRoleAuthorities
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QRoleAuthorities extends com.mysema.query.sql.RelationalPathBase<QRoleAuthorities> {

    private static final long serialVersionUID = -1141242361;

    public static final QRoleAuthorities roleAuthorities = new QRoleAuthorities("role_authorities");

    public final NumberPath<Long> authorityId = createNumber("authority_id", Long.class);

    public final NumberPath<Long> roleId = createNumber("role_id", Long.class);

    public final com.mysema.query.sql.PrimaryKey<QRoleAuthorities> roleAuthoritiesPkey = createPrimaryKey(roleId, authorityId);

    public final com.mysema.query.sql.ForeignKey<QAuthorities> roleAuthoritiesAuthorityIdFkey = createForeignKey(authorityId, "authority_id");

    public final com.mysema.query.sql.ForeignKey<QRoles> roleAuthoritiesRoleIdFkey = createForeignKey(roleId, "role_id");

    public QRoleAuthorities(String variable) {
        super(QRoleAuthorities.class, forVariable(variable), "public", "role_authorities");
    }

    @SuppressWarnings("all")
    public QRoleAuthorities(Path<? extends QRoleAuthorities> path) {
        super((Class)path.getType(), path.getMetadata(), "public", "role_authorities");
    }

    public QRoleAuthorities(PathMetadata<?> metadata) {
        super(QRoleAuthorities.class, metadata, "public", "role_authorities");
    }

}

