package net.exacode.example.application.query.querydsl;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QDataTypePrivileges is a Querydsl query type for QDataTypePrivileges
 */
@Generated("com.mysema.query.sql.codegen.MetaDataSerializer")
public class QDataTypePrivileges extends com.mysema.query.sql.RelationalPathBase<QDataTypePrivileges> {

    private static final long serialVersionUID = -38589878;

    public static final QDataTypePrivileges dataTypePrivileges = new QDataTypePrivileges("data_type_privileges");

    public final SimplePath<Object> dtdIdentifier = createSimple("dtd_identifier", Object.class);

    public final SimplePath<Object> objectCatalog = createSimple("object_catalog", Object.class);

    public final SimplePath<Object> objectName = createSimple("object_name", Object.class);

    public final SimplePath<Object> objectSchema = createSimple("object_schema", Object.class);

    public final SimplePath<Object> objectType = createSimple("object_type", Object.class);

    public QDataTypePrivileges(String variable) {
        super(QDataTypePrivileges.class, forVariable(variable), "information_schema", "data_type_privileges");
    }

    @SuppressWarnings("all")
    public QDataTypePrivileges(Path<? extends QDataTypePrivileges> path) {
        super((Class)path.getType(), path.getMetadata(), "information_schema", "data_type_privileges");
    }

    public QDataTypePrivileges(PathMetadata<?> metadata) {
        super(QDataTypePrivileges.class, metadata, "information_schema", "data_type_privileges");
    }

}

